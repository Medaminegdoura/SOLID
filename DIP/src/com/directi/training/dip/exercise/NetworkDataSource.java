package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataSource implements DataSource {
    private String url;

    public NetworkDataSource(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        URL urlObj = new URL(url);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlObj.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }
}