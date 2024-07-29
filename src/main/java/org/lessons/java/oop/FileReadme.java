package org.lessons.java.oop;

import java.io.File; // CLASSE PER L'ACQUISIZIONE DEL PATH DEL FILE;

//CLASSE PER LA GESTIONE DELL'ECCEZIONE;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import java.util.Scanner; // CLASSE PER SCANNERIZZARE IL CONTENUTO DEL FILE;


public class FileReadme {

	public static void main(String[] args) throws FileNotFoundException {

		// CREAZIONE OGGETTO FILE
		File fileTxt = new File("readme.txt");
		
		try {
			
			// CREAZIONE OGGETTO SCANNER CHE ANDRA' A LEGGERE IL CONTENUTO DEL FILE
			Scanner readLineFile = new Scanner(fileTxt);
			
			// VIENE CONTROLLATO SE , AL CICLARE DELLA NUOVA RIGA, ESISTE UN'ALTRA RIGA E VIENE STAMPATA;
			while(readLineFile.hasNextLine()) {
				String line = readLineFile.nextLine();
				System.out.println(line);		
		}
			
		readLineFile.close();
		System.out.println("ESECUZIONE FINITA");
			
		// GESTIONE DELL'ECCEZIONE SE IL FILE NON E' TROVATO;
		} catch (FileNotFoundException e) {
			
			System.out.println("ERROR FILE NOT FOUND ---> " + e.getMessage());
			
			//BONUS;
			throw new FileNotFoundException ("ERROR FILE NOT FOUND ---> IL FILE NON E' PRESENTE");
		}	
		
		// GESTIONE DELL'ECCEZIONE SE IL FILE NON PRESENTA CONTENUTO;
		catch (NoSuchElementException  e) {
		
			System.out.println("ERROR NO SUCH ELEMENT ---> " + e.getMessage());
			
			//BONUS;
			throw new NoSuchElementException ("ERROR NO SUCH ELEMENT ---> IL FILE NON PRESENTA CONTENUTO");
			
		}
		
	}

	
}
