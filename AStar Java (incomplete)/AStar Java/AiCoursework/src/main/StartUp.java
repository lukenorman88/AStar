package main;

import java.io.File;
import java.util.Scanner;

public class StartUp {

	public static void main(String[] args) {
		
		File cavFile1 = new File("input1.cav");		
		FileReader fileReader = new FileReader();			
		
		fileReader.reader(cavFile1);
	}
}
