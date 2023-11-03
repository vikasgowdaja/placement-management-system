package day8;

import java.io.File;

public class DeleteFolderDemo {
    public static void main(String[] args) {
        File folder = new File("new_folder");

        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("Folder deleted successfully.");
            } else {
                System.out.println("Failed to delete the folder.");
            }
        } else {
            System.out.println("Folder does not exist.");
        }
    }
}
