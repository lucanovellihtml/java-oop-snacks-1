package org.lessons.java.oop;

public class Studente {

	// VARIABILI
	private String name, surname, age;
	
	// COSTRUTTORE
	public Studente(String name, String surname, String age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	
	// METODI GETTER/SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	//METODO DI CONCATENAZIONE
	public String getConcatenation() {
		return this.name + " " + this.surname + "," + this.age + " anni";
	}

	
	
}
