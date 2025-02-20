package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // TODO Add them in args
        EncodingModule encodingModule = new FileEncoder(
                "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt",
                "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode();
        encodingModule = new NetworkAndDatabaseEncoder(null, "https://www.gutenberg.org/cache/epub/22566/pg22566");
        encodingModule.encode();
    }
}
