package com.gmail.bilvania2906.homeworks.homework23;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileName, String fileContent) {
        try (FileWriter fw = new FileWriter(BASE_PATH + fileName + ".txt")) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return "Error:" + e.getMessage();
        }
    }

    public String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            int sym;
            new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return path;
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}

