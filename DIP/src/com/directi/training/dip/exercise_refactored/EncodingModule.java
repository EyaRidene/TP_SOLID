package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule {
    private final Database database;

    public EncodingModule(Database database) {
        this.database = database;
    }

    public void encodeWithFiles() throws IOException {
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        String encodedString = ""; 

        database.write(encodedString);
    }
}
