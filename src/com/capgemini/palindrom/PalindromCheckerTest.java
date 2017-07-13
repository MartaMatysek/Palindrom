package com.capgemini.palindrom;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PalindromCheckerTest {

	@Test(expected = BussinesException.class)
	public void testEmptyString(){
		//given
		String aktual = "";
		//when
		PalindromChecker.isPalindromAfterChangeInput(aktual);
		//then
		fail("This method should throw BusinessException");
	}
	

	@Test
	public void testOneChar() {
		//given
		String aktual = "a";
		//when
		boolean result = PalindromChecker.isPalindromAfterChangeInput(aktual);
		//then
		Assert.assertTrue(result);
	}
		
	@Test
	public void testPalindromRegularString() {
		//given
		String aktual = "kobyla ma maly bok";
		//when
		boolean result = PalindromChecker.isPalindromAfterChangeInput(aktual);
		//then
		Assert.assertTrue(result);
	}
	
	@Test
	public void testPalindromString() {
		//given
		String aktual = "abgh 234 !!! 34      hgba";
		//when
		boolean result = PalindromChecker.isPalindromAfterChangeInput(aktual);
		//then
		Assert.assertTrue(result);
	}
	
	@Test
	public void testNotPalindromString() {
		//given
		String aktual = "To wcale nie jest palindrom.";
		//when
		boolean result = PalindromChecker.isPalindromAfterChangeInput(aktual);
		//then
		Assert.assertFalse(result);
	}
	
	@Test(expected =  BussinesException.class)
	public void testBadStringWithSpecialChars(){
		//given
		String aktual = "123 @@ ! .,; :( :)   ";
		//when
		PalindromChecker.isPalindromAfterChangeInput(aktual);
		//then
		fail("This method should throw BusinessException");
	}
}
