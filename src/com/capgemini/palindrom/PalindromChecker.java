package com.capgemini.palindrom;

/**
 * Klasa PalindromChecker przechowuje wszystkie metody niezbędne do sprawdzenia, 
 * czy dany tekst jest palindromem (tj. czy czytany od tyły brzmi tak samo, jak czytany od początku).
 */

public class PalindromChecker {
	
	/**
	 * Metoda isPalindromAfterChangeInput przyjmuje tekst z którego następnie pobiera tylko litery.
	 * Jeśli tekst jest pusty - wyrzuca wyjątek. W przeciwnym wypadku wywołana zostaje metoda {@link #isPalindrom(String)}.
	 * @param input tekst, który ma być sprawdzony
	 * @return true, jeśli wczytany teskt jest palindromem, false w przeciwnym wypadku
	 * @throws BussinesException wyjątek zostaje wyrzucony, gdy test, który chcemy sprawdzić ma długość 0
	 */
	
	public static boolean isPalindromAfterChangeInput(String input) throws BussinesException{
		String text = input.toLowerCase().replaceAll("[^a-z]","");
		
		if(text.length()==0){
				throw new BussinesException("This input is incorrect!");
		}
		else{
			return PalindromChecker.isPalindrom(text);			
		}
	}
	
	/**
	 * Metoda isPalindrom sprawdza, czy podany teskt jest palindromem, czy nie.
	 * @param input tekst, który ma być sprawdzony
	 * @return true lub false
	 */
	
    private static boolean isPalindrom(String  input) {	
    	    	
    	if(input.length() < 2){
    		return true;    		
    	}
    	else if(input.charAt(0) == input.charAt(input.length()-1)){
    		input = input.substring(1, input.length()-1);
    		return isPalindrom(input);
    	}
    	
    	return false;
    }   
}
