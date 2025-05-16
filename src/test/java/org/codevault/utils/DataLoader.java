package org.codevault.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class DataLoader {

    private final Properties properties = new Properties();
    private static DataLoader dataLoader;

    private DataLoader() {
        Path path = Path.of("src/test/resources/config.properties");
        if (Files.exists(path)) {
            try (FileInputStream fis = new FileInputStream(path.toFile())) {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load config.properties", e);
            }
        }
        // else: properties remains empty, no file to load
    }

    public static DataLoader getInstance() {
        if (dataLoader == null) {
            dataLoader = new DataLoader();
        }
        return dataLoader;
    }

    public String getClientId() {
        String envClientId = System.getenv("CLIENT_ID");
        if (envClientId != null && !envClientId.isEmpty()) {
            return envClientId;
        }

        String prop = properties.getProperty("clientId");
        if (prop != null && !prop.isEmpty()) return prop;

        throw new RuntimeException("CLIENT_ID not found in environment variables or config.properties");
    }

    public String getClientSecret() {
        String envClientSecret = System.getenv("CLIENT_SECRET");
        if (envClientSecret != null && !envClientSecret.isEmpty()) {
            return envClientSecret;
        }

        String prop = properties.getProperty("clientSecret");
        if (prop != null && !prop.isEmpty()) return prop;

        throw new RuntimeException("CLIENT_SECRET not found in environment variables or config.properties");
    }
}
