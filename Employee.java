package it.support.admin;

public class Employee {
	String firstName;
	String lastName;
	String deptInput;

	public Employee(String firstName, String lastName, String deptInput) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptInput = deptInput;

	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the deptInput
	 */
	public String getDeptInput() {
		return deptInput;
	}
	
}
