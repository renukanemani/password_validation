package com.problem.password.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.problem.password.exception.InvalidPasswordException;
import com.problem.password.validation.PasswordValidator;

public class PasswordValidatorTest {

	public PasswordValidator passwordValidator = new PasswordValidator();
	
	@Test
	public void testValidPassword() {
		boolean isValid = false;
		try {
			isValid = passwordValidator.isValid("as9jjnjnnjnkR");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.printMessage());
		}
		assertTrue(isValid);
	}
	
	@Test
	public void testEmptyPassword() {
		boolean isValid = false;
		try {
			isValid = passwordValidator.isValid("");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.printMessage());
		}
		assertFalse(isValid);
	}
	
	@Test
	public void testPasswordLessThan8Char() {
		boolean isValid = false;
		try {
			isValid = passwordValidator.isValid("gfgG8");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.printMessage());
		}
		assertFalse(isValid);
	}
	
	@Test
	public void testPasswordNoSmallChar() {
		boolean isValid = false;
		try {
			isValid = passwordValidator.isValid("GFTH8JKILNJH");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.printMessage());
		}
		assertFalse(isValid);
	}
	
	@Test
	public void testPasswordNoUpperChar() {
		boolean isValid = false;
		try {
			isValid = passwordValidator.isValid("ghvghgfghf887");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.printMessage());
		}
		assertFalse(isValid);
	}
	
	@Test
	public void testPasswordNoDigit() {
		boolean isValid = false;
		try {
			isValid = passwordValidator.isValid("ghvghgfghfhgh");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.printMessage());
		}
		assertFalse(isValid);
	}
}
