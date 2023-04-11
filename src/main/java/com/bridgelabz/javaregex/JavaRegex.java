package com.bridgelabz.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		String regex = "^([0-9]*[a-zA-Z]){3,}[0-9]*$";

		Pattern pattern = Pattern.compile(regex);

		String data = "12mjjj";
		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();

		if (result)
			System.out.println("Pattern matach");
		else
			System.out.println("Pattern not matched");

	}

}
