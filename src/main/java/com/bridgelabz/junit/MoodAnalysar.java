package com.bridgelabz.junit;

public class MoodAnalysar {

	public String analysisMood(String message) {

		if (message.contains("Sad")) {
			return "Sad";

		} else {
			return "Happy";
		}

	}

}
