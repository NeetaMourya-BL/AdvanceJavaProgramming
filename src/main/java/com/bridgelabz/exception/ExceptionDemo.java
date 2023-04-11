package com.bridgelabz.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		int array[] = new int[2];
		try {
			System.out.println("Access element: " + array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
		}

		finally {
			array[0] = 6;
			System.out.println("First element of the array is: " + array[0]);
			System.out.println("Finally block execute");
		}
	}

}
