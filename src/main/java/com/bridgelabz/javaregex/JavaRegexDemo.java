package com.bridgelabz.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexDemo {

	public static boolean isValidUsername(String name)
    {
        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{3,29}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }
        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);
        // Return if the username
        // matched the ReGex
        return m.matches();
    }
  
    // main function
    public static void main(String[] args)
    {
        // Test Case: 1
        String str1 = "Neetamourya";
        System.out.println(isValidUsername(str1));
    }
}
