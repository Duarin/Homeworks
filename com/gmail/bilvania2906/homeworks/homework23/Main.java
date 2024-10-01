package com.gmail.bilvania2906.homeworks.homework23;

import java.io.IOException;

public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile";
        String fileContent = "My very important information.";
        String result = handler.writeFile(fileName, fileContent);
        getOutput("RESULT: " + result);
        String content = handler.readFile(BASE_PATH + fileName + ".txt");
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}