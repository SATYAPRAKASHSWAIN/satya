package com.exception;

class Addition {
	public static void add() throws Exception {
		int a = 5, b = 0, c;
		if (b != 0) {
			c = a / b;
			System.out.println("Additin of two no is :");

		} else {
			System.out.println("exception handle");
			throw new ArithmeticException("cann't divided by zero");

		}

	}
}

public class Sample_throw_throws {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		a.add();

	}

}
