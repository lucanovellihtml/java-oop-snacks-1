package org.lessons.java.oop;

import java.util.Scanner;

public class RegistroStudenti {

	private String[] classStudents;
	
	public RegistroStudenti() {
		this.classStudents = new String[0];
	}

	// METODO PER STAMPARE LA CLASSE DI STUDENTI
	public String[] getClassStudents() {
		return classStudents;
	}

	// METODO PER AGGIUNGERE GLI STUDENTI
	public void setClassStudents(int length) {
		this.classStudents = new String[length];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < length; i++) {
			System.out.print("- INSERISCI IL NUME STUDENTE ---> ");
			this.classStudents[i] = input.nextLine();
		}
		
		input.close();
	}
	
	
	
}
