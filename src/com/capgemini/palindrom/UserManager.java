package com.capgemini.palindrom;

import java.util.Scanner;

/**
 * UserManager to klasa przeznaczona do interakcji z użytkownikiem. 
 * Pozawala na wczytanie do konsoli danego tekstu oraz wykonaniu metody {@link #main(String[])}.
 */

public class UserManager {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Metoda Main kontaktuje się z użytkownikiem pozwalając na wprowadzenie tekstu, który jest potem sprawdzany.
	 * Jeśli wprowadzony tekst jest nieprawidłowy, wyrzucony zostaje wyjątek z klasy {@link BussinesException}.
	 * @param args
	 */
	public static void main(String[] args){
		String text = "";
		
		do{
			System.out.println("Enter an expression: ");
			text = sc.nextLine();
			
			try{
				if(PalindromChecker.isPalindromAfterChangeInput(text)){
					System.out.println("Expression is a palindrome.");		
				}
				else{
					System.out.println("Expression is not a palindrome.");					
				}
			}
			catch (RuntimeException e){
				System.out.println(e);
			}	
			finally{
				System.out.println("Do you want to continue? [yes/no]");
				text = sc.nextLine();
			}
			
		}while(text.equals("yes"));	
		
		System.out.println("See you later.");
	 }  

}
