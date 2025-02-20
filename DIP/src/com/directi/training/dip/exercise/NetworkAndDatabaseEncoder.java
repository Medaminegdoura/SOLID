package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class NetworkAndDatabaseEncoder extends EncodingModule {
    private MyDatabase database;
    private String urlString;

    NetworkAndDatabaseEncoder(MyDatabase db, String urlString) {
        database = db != null ? db : new MyDatabase();
        this.urlString = urlString;
    }

    public void encode() throws IOException {
        URL url;
        url = new URL(urlString);
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        System.out.println(encodedString);
        database.write(encodedString);
    }
}
