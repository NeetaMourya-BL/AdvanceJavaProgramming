package com.bridgelabz.junit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysarTest {

	@Test
	public void testMoodAnalysis() {

		MoodAnalysar moodAnalysar = new MoodAnalysar();

		String mood = moodAnalysar.analysisMood("This is a sad mood");
		Assert.assertThat(mood, CoreMatchers.is("Happy"));
	}

	@Test
	public void testMoodAnalysisTwo() {

		MoodAnalysar moodAnalysar = new MoodAnalysar();

		String mood = moodAnalysar.analysisMood("This is a sad mood");

		Assert.assertEquals("Sad", "Sad");
	}

}
