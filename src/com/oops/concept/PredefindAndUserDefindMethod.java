package com.oops.concept;

public class PredefindAndUserDefindMethod {
	public static Integer sumOfTwoNo(int n1, int n2) {
		int c;
		c = n1 + n2;
		return c;

	}

	public static void main(String[] args) {
		// using the predefind max() method of Math class
		System.out.println("The maximum no is:" + Math.max(9, 7));

		// Using the userdefind method
		int x = sumOfTwoNo(8, 7);
		System.out.println("Sum of two no is:" + x);

	}

}
