package com.ge.test.ireport;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileStorage {

    private final static String basePath = "storage";

    public static void storeData (String fileName, String data) throws IOException
    {
        new File(basePath).mkdirs();
        BufferedWriter writer = new BufferedWriter(new FileWriter(basePath+File.separator+fileName));
        writer.write(data);
        writer.close();
    }

    public static String readData (String filePath) throws java.io.IOException
    {
        File file = new File(basePath+File.separator+filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String data = "";
        String st;

        while ((st = br.readLine()) != null) {
            data += st;
        }

        return data;
    }
}