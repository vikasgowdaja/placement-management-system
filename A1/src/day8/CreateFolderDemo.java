package day8;

import java.io.File;

public class CreateFolderDemo {
    public static void main(String[] args) {
        File folder = new File("new_folder");

        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Folder created successfully.");
            } else {
                System.out.println("Failed to create the folder.");
            }
        } else {
            System.out.println("Folder already exists.");
        }
    }
}

