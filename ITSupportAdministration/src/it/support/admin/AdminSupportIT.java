package it.support.admin;

import java.util.Scanner;

public class AdminSupportIT {

	public static void main(String[] args) {
		byte userInput;

		System.out.println("!! Welcome IT System Administration Application !!");
		System.out.println(" Enter the requested details for generating the credentials of the new hire as prompted");
		// System.out.println(\n);

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter First Name: ");

		String firstName = myObj.nextLine(); // Read First Name as input
		System.out.println("First Name is: " + firstName); // Output user input

		System.out.println("Enter Last Name: ");

		String lastName = myObj.nextLine(); // Read Last Name as input
		System.out.println("Last name is: " + lastName); // Output user input

		System.out.println(
				"Please enter the department from the following \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		// console = null;

		userInput = (byte) myObj.nextInt();
		// System.out.println("your selection is " + userInput);

		String deptInput = "";
		// Switch statement
		switch (userInput) {
		// case statements
		// System.out.println("Im in selection ");
		case 1:
			deptInput = "tech";
			// console.close();
			// System.out.println("Im in 1st selection ");
			break;
		case 2:
			deptInput = "Admin";
			// console.close();
			// System.out.println("Im in 2nd selection ");
			break;

		case 3:
			deptInput = "Human Resource";
			// console.close();
			// System.out.println("Im in 3rd selection ");
			break;
		case 4:
			deptInput = "Legal";
			// console.close();
			// System.out.println("Im in 4th selection ");
			break;
		default:
			// System.out.println("Im in 1st selection ");
			deptInput = "wrong";

			// System.out.println("you have selected department " + userInput);

		}
		// System.out.println("im out of Switch and the selection is " + userInput);
		myObj.close();
		if (deptInput != "wrong") {
			Employee emp = new Employee(firstName, lastName, deptInput);
			CredentialService creds = new CredentialService(firstName, lastName, deptInput);

			creds.createEmailAddress();
			creds.createCredentials();
		} else
			System.out.println("Enter correct Department Name and retry");
	}
}
