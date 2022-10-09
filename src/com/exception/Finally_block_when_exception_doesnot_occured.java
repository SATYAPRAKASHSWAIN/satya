package com.exception;

public class Finally_block_when_exception_doesnot_occured {
	public static void main(String[] args) {
		try {
			String s = "satya";
			System.out.println("Sting lenth is:" + s.length());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("null pointer exception occured in this exception!");
		} finally {
			System.out.println(
					"finally block is executed ,it is no impact the try catch is present or not,and exception is handle or not ");
		}
	}

}
