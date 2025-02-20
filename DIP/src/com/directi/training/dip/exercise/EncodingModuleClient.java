package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DataSource fileSource = new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataDestination fileDest = new FileDataDestination("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncoder = new FileEncoder(fileSource, fileDest);
        fileEncoder.encode();

        DataSource networkSource = new NetworkDataSource("https://www.gutenberg.org/cache/epub/22566/pg22566");
        MyDatabase database = new MyDatabase();
        DataDestination dbDest = new DatabaseDataDestination(database);
        EncodingModule networkEncoder = new NetworkAndDatabaseEncoder(networkSource, dbDest);
        networkEncoder.encode();
    }
}