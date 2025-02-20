package com.directi.training.dip.exercise;

import java.io.IOException;

public class DatabaseDataDestination implements DataDestination {
    private MyDatabase database;

    public DatabaseDataDestination(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String data) throws IOException {
        database.write(data);
    }
}