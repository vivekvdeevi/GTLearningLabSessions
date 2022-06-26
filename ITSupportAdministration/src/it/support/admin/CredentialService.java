package it.support.admin;

public class CredentialService extends Employee {

	public CredentialService(String firstName, String lastName, String deptInput) {
		// super(firstName, lastName, deptInput);
		super(firstName, lastName, deptInput);
		// TODO Auto-generated constructor stub
	}

	String emailAddress;
	String newPassword;
//System.out.println("Dear "+firstName+" your generated credentials are as follows");
	public void createEmailAddress() {
		emailAddress = firstName + lastName + "@" + deptInput + "." + "abc.com";
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email Address ---> "+emailAddress);
	}

	public void createCredentials() {
		byte n = 8;
		System.out.println("Credentials---> "+getAlphaNumericString(n));
		//System.out.println(getAlphaNumericString(n));
	}

	static String getAlphaNumericString(byte n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz"
				+ "!@#$%^*";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (byte i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			byte index = (byte) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}
