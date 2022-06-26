package com.gl.model;

public class Employee {

	
	
	public Employee() {
		super();
	}

	public Employee( String firstName, String lastName)
{
	this.firstName="Vivek";
	this.lastName="Deevi";
}
	private String firstName;
	private String lastName;
	
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
		
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return this.firstName;
		
	}

	
	public static void main(String[] args)
	{
		Employee emp=new Employee();
	}
}
