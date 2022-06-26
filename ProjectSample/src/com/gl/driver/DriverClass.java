package com.gl.driver;

import java.sql.SQLOutput;
import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Vivek","Deevi");
		CredentialService cservice=new CredentialService();
		Scanner newScan = new Scanner(System.in);
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		byte choice;
		System.out.println("select your choice");
		choice = newScan.nextByte();

		if (choice == 1)
		{
			String generatedEmail;
			char[] generatedPassword;
			generatedEmail=cservice.generateEmail(employee.getFirstName(),employee.getLastName(),"Tech");
			generatedPassword=cservice.generatePassword();
			cservice.displayCredentils(employee, generatedEmail, generatedPassword);
		}
		else if
		(choice == 2)
		{
			String generatedEmail;
			char[] generatedPassword;
			generatedEmail=cservice.generateEmail(employee.getFirstName(),employee.getLastName(),"Admin");
			generatedPassword=cservice.generatePassword();
			cservice.displayCredentils(employee, generatedEmail, generatedPassword);
		}
		else if
		(choice == 3)
		{
			String generatedEmail;
			char[] generatedPassword;
			generatedEmail=cservice.generateEmail(employee.getFirstName(),employee.getLastName(),"HR");
			generatedPassword=cservice.generatePassword();
			cservice.displayCredentils(employee, generatedEmail, generatedPassword);
		}
		else if
		(choice == 4)
		{
			String generatedEmail;
			char[] generatedPassword;
			generatedEmail=cservice.generateEmail(employee.getFirstName(),employee.getLastName(),"Legal");
			generatedPassword=cservice.generatePassword();
			cservice.displayCredentils(employee, generatedEmail, generatedPassword);
		}
	}

}
