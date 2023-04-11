package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean isValidUserFirstName(String firstName) {
		// Regex to check valid username.
		String regex = "^[A-Z]{1,}[a-z]\\w{3,29}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the username is empty
		// return false
		if (firstName == null) {
			return false;
		}
		// Pattern class contains matcher() method
		// to find matching between given username
		// and regular expression.
		Matcher m = p.matcher(firstName);
		// Return if the username
		// matched the ReGex
		return m.matches();
	}

	public static boolean isValidUserLastName(String lastName) {
		// Regex to check valid lastName.
		String regex = "^[A-Z]{1,}[a-z]\\w{3,29}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the lastName is empty
		// return false
		if (lastName == null) {
			return false;
		}
		// Pattern class contains matcher() method
		// to find matching between given lastName
		// and regular expression.
		Matcher m = p.matcher(lastName);
		// Return if the lastName
		// matched the ReGex
		return m.matches();
	}

}