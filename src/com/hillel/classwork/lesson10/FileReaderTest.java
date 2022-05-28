package com.hillel.classwork.lesson10;

import java.io.*;

public class FileReaderTest {

    public static final String FILE_NAME = "/Users/os-mari.kolodzheieva/test/test.txt";

    public static void main(String[] args) {

        readFile();
        writeFile("\nNew text for file");
        readFile();

    }

    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void writeFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
