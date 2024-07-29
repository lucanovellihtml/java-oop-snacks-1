package org.lessons.java.oop;

import java.io.File; // CLASSE PER L'ACQUISIZIONE DEL PATH DEL FILE;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner; // CLASSE PER SCANNERIZZARE IL CONTENUTO DEL FILE;

public class FileReadme {

	public static void main(String[] args) {
		
		File fileTxt = new File("readme.txt");
		
		try {
			
			Scanner readLineFile = new Scanner(fileTxt);
			
			while(readLineFile.hasNextLine()) {
				String line = readLineFile.nextLine();
				System.out.println(line);		
		}
			
		readLineFile.close();
		System.out.println("ESECUZIONE FINITA");
			
		} catch (FileNotFoundException e) {
			
			System.out.println("ERROR FILE NOT FOUND ---> " + e.getMessage());
	
		}	
		
		catch (NoSuchElementException  e) {
			
			System.out.println("ERROR NO SUCH ELEMENT ---> " + e.getMessage());
			
		}
		
	}

	
}
