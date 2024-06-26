package org.lessons.java.oop;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//SNACK 1
		Studente students = new Studente("Luca", "Novelli", "23");
		System.out.println("---------- SNACK 1 --------");
		System.out.println("- CONCATENAZIONE ---> " + students.getConcatenation());
		System.out.println("");
		
		//SNACK 2
		System.out.println("---------- SNACK 2 --------");
		ContoBancario bankAccountPersonal = new ContoBancario("IT 12 A 12345 12345 123456789012");
		bankAccountPersonal.setBalance(11.000);
		System.out.printf("- SALDO DISPONIBILE ---> %.3f€ \n",bankAccountPersonal.getBalance());
		bankAccountPersonal.setLessBalance(5.000);
		System.out.printf("- SALDO DISPONIBILE ---> %.3f€ \n",bankAccountPersonal.getBalance());
		System.out.println("");
		
		//SNACK3
		System.out.println("---------- SNACK 3 --------");
		RegistroStudenti classStudents = new RegistroStudenti();
		classStudents.setClassStudents(3);
		//METODO CHE PERMETTE DI STAMPARE L'ARRAY COME UNA OGGETTO LISTA
		System.out.println("- CLASSE STUDENTI ---> " + Arrays.toString(classStudents.getClassStudents()));
		
	}

}
