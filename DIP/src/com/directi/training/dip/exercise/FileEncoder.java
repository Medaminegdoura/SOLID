package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class FileEncoder extends EncodingModule {
    private String inputStream;
    private String outputStream;

    FileEncoder(String in, String out) {
        this.inputStream = in;
        this.outputStream = out;
    }

    public void encode() throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                    new FileReader(inputStream));
            writer = new BufferedWriter(
                    new FileWriter(outputStream));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }
}
