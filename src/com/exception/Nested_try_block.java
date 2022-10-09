package com.exception;

public class Nested_try_block {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Going to devide by 0");
				int b = 39 / 0;

			}
			// catch (NullPointerException e) {
			catch (ArithmeticException e) {

				System.out.println(e);
			}
			// ===========================================
			try {
				int[] a = new int[5];
				a[7] = 4;

			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println("Finish inner try catch block");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handler the exception(outer catch)");
		}
		System.out.println("Normal flow");
	}

}
