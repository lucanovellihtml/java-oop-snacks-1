package org.lessons.java.oop;

public class ContoBancario {

	private String bankAccount;
	private double balance;
	
	public ContoBancario(String bankAccount) {
		this.bankAccount = bankAccount;
		this.balance = 0.0;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	// METODO PER OTTENERE IL SALDO CORRENTE
	public double getBalance() {
		return balance;
	}

	// METODO PER DEPOSITARE DENARO SUL CONTO
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	// METODO PER PRELEVARE DENARO SUL CONTO
	public void setLessBalance(double balance) {
		this.balance -= balance;
	}
	
	
	
}
