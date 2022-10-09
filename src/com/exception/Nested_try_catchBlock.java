package com.exception;

public class Nested_try_catchBlock {

	public static void main(String[] args) {
		try {
			// try block 1
			try {
				// try block 2
				try {
					// try block 3
					int a[] = new int[5];
					a[7] = 7;

				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println(e);
					System.out.println("Arithmetic exception of first block");
				}

			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println(e);
				System.out.println("nullpointer exception of second block");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("array index out of bound exception");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception handle at main class");
		}

	}

}
