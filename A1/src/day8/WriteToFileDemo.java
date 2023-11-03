package day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
    public static void main(String[] args) {
        String content = "Hello, this is content to be written to the file.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}