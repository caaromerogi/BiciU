package com.sofka.main;

import java.io.File;
import java.io.IOException;

public class BiciU {
    public static void main(String[] args) {
        File file = new File("src//main//Data//test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
