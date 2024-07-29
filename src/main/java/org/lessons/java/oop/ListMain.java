package org.lessons.java.oop;

import java.util.ArrayList;
import java.util.HashSet;

public class ListMain {

	public static void main(String[] args) {
		
		
		//REQUEST 1;
		System.out.println("-*-*-*-*- REQUEST UNO -*-*-*-*-");
		ArrayList <String> nameList = new ArrayList <String>();
		
		nameList.add("Luca");
		nameList.add("Giovanni");
		nameList.add("Marco");
		nameList.add("Alessandro");

		System.out.println("POSIZIONE RICERCATO ---> "  + searchNameList(nameList, "arco"));
		
		
		//REQUEST 2;
		System.out.println("\n-*-*-*-*- REQUEST DUE -*-*-*-*-");
		HashSet <String> setFirst = new HashSet <String>();
		HashSet <String> setSecond = new HashSet <String>();
		
		setFirst.add("Element 1");
		setFirst.add("Element 2");
		setFirst.add("Element 3");
		setSecond.add("Element 1");
		setSecond.add("Element 2");
		setSecond.add("Element 3");
		
		System.out.println("LE DUE LISTE SONO UGUALI ---> "  + checkEqualsElements(setFirst, setSecond));
		
	}
	
	
	
	/**
	 * 
	 * @param nameList, è la lista degli invitati
	 * @param name, è il nome del ricercato
	 * @return l'indice se il name è presenta nella lista, -1 se non è presente
	 */
	public static int searchNameList(ArrayList <String> nameList, String name) {
		
		int indexCount = 0;
		
		System.out.println("INIZIO RICERCA...");
		
		for(String nameInvitation : nameList) {
			
			//System.out.println("CONFRONTO TRA INVITATO : " + nameInvitation + " E RICERCATO : " + name);
			if(nameInvitation.equals(name)) {
				return indexCount;
			}
			
			indexCount ++;
			
		}
		
		return  -1;
		
	}

	
	/**
	 * 
	 * @param setFirst, è la prima lista
	 * @param setSecond, è la seconda lista
	 * @return return false se il contenuto delle due liste non sono uguali
	 */
	public static boolean checkEqualsElements(HashSet <String> setFirst, HashSet <String> setSecond) {
	
			//IL METODO CONFRONA LA COLLEZIONE DELLA LISTA UNO CON LA LISTA DUE, IN CASO DI COLLEZIONE UGUALE VIENE RESTITUITO TRUE;
			if(setFirst.containsAll(setSecond))
				return true;
		
		return false;
	}
		
		
}
	
