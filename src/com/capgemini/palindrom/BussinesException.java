package com.capgemini.palindrom;

/**
 * Klasa BussinesException dziedziczy po RuntimeException i zgłasza odpowiedni komunikat,
 * gdy wproadzone dane wejściowe są błędne.
 */

public class BussinesException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Konstruktor, który przyjmuje odpowiedni komunikat przekazywany dalej użytkownikowi
	 * @param text 
	 */

	public BussinesException(String text){
		super(text);
	}
}
