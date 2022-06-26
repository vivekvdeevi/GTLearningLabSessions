package com.gl.service;

import java.util.Iterator;
import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialChars = "~!@#$%^&*()";

		String myWord = capitalLetters + smallLetters + numbers + specialChars;
		char[] password = new char[8];
		Random random = new Random();
		for (byte i = 0; i < 8; i++)

		{
			password[i] = myWord.charAt(random.nextInt(myWord.length()));
		}
		return password;
	}

	public String generateEmail(String firstName, String lastName, String department) {
		String generatedEmail;
		//System.out.println("in generate email");
		generatedEmail = firstName + lastName + "." + department + "@abc.com";
		//System.out.println("before return");
		return generatedEmail;

	}

	public void displayCredentils(Employee employee, String generatedEmail, char[] genPassword) {
		System.out.println("Hi " + employee.getFirstName());
		System.out.println("your email is " + generatedEmail);
		System.out.println("your password is " + genPassword);
	}
}
