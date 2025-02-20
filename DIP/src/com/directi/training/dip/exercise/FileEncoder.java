package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class FileEncoder extends EncodingModule{
    private DataSource source;
    private DataDestination destination;

    public FileEncoder(DataSource source, DataDestination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void encode() throws IOException {
        String data = source.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        destination.write(encodedData);
    }
}