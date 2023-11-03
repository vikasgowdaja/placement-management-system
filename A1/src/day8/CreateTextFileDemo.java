package day8;

import java.io.File;
import java.io.IOException;

public class CreateTextFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");

        
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        
    }
}
