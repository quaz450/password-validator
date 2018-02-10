package com.example.jessi.password_validator;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.xml.validation.Validator;


public class Validator_Test {
	//pass at least 1 rule rule
	@Test
	public void passwordIsNotPassword() {
		String str = "notpassword";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)>=1);
	}
	
	@Test
	public void passwordIsNotShort() {
		String str = "eightlong";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)>=1);
	}
	
	@Test
	public void hasDifCase() {
		String str = "ThisIsMyPassword";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)>=1);
	}
	
	@Test
	public void hasNumber(){
		String str = "MyPass123";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)>=1);
	}
	
	@Test
	public void noThreeConsec(){
		String str = "NoConsecutive123";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)>=1);
	}
	
	//at least 1 rule is broken
	@Test
	public void passwordIsPassword() {
		String str = "PassWOrd";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)<5);
	}
	
	
	@Test
	public void passwordIsShort() {
		String str = "pass";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)<5);
	}

	@Test
	public void hasNoDifCase() {
		String str = "thisismypassword";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)<5);
	}
	
	@Test
	public void hasNoNumber(){
		String str = "qwertyuio";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)<5);
	}
	
	@Test
	public void threeConsec(){
		String str = "AaaBbBCccDdEe";
		assertTrue(com.example.jessi.password_validator.PasswordValidator.validate(str)<5);
	}
	
	
	

		
}
