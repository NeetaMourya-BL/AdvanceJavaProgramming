package com.bridgelabz.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckingAnnotationPriorityTest {

	@Before
	public void before() {
		System.out.println("This is before annotaion");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is before class annotaion");

	}

	@Test
	public void testCaseOne() {

		System.out.println("Test case 1 method");
	}

	@Test
	public void testCaseTwo() {

		System.out.println("Test case 2 method");
	}

	@Test
	public void testCaseThree() {

		System.out.println("Test case 3 method");
	}

	@Test
	public void testCasefour() {

		System.out.println("Test case 4 method");
	}

	@Test
	public void testCaseFive() {

		System.out.println("Test case 5 method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("This is after class annotation");
	}

	@After
	public void after() {
		System.out.println("This is after annotation");
	}

}
