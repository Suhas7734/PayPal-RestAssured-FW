package org.codevault.filters;


import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    @Override
    public Response filter(FilterableRequestSpecification requestSpec,
                           FilterableResponseSpecification responseSpec,
                           FilterContext ctx) {
        logRequest(requestSpec);
        Response response = ctx.next(requestSpec, responseSpec);
        logResponse(response);
        return response;
    }

    public void logRequest(FilterableRequestSpecification requestSpec) {
        logger.info("BASE_URI: " + requestSpec.getBaseUri());
        StringBuilder maskedHeaders = new StringBuilder();
        requestSpec.getHeaders().asList().forEach(header -> {
            if (header.getName().equalsIgnoreCase("Authorization")) {
                maskedHeaders.append("Authorization: ****\n");
            } else {
                maskedHeaders.append(header.getName()).append(": ").append(header.getValue()).append("\n");
            }
        });
        logger.info("Request Header: " + maskedHeaders.toString().trim());
        logger.info("Request Payload: " + requestSpec.getBody());
    }

    public void logResponse(Response response) {
        logger.info("Status Code: " + response.getStatusCode());
        logger.info("Response Header: " + response.getHeaders());
        logger.info("Response Payload: " + response.getBody().prettyPrint());
    }
}
