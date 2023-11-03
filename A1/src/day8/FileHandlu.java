package day8;

import java.io.File;
import java.io.IOException;

public class FileHandlu {
public static void main(String[] args) {
	File file = new File("Vikas.txt");
	try{if (file.createNewFile())
		{System.out.println("File Successfully Created");
		}
	else {
		System.out.println("File Already Exists");
	}
	}
	catch(IOException e) {System.out.println("An Error occured while creating the file:");
		
	}
	
}
}