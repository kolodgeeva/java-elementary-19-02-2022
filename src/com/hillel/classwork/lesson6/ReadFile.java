package com.hillel.classwork.lesson6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        try (InputStream inputStream = new FileInputStream("D:/Users/UserName/someFile.txt");
             BufferedInputStream buffer = new BufferedInputStream(inputStream)) {
            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                System.out.println("Был прочитан символ " + c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
