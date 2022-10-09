package com.exception;

public class User_defind_exception extends Exception {
	User_defind_exception(String str) {
		super(str);
	}

	public static void main(String[] args) {
		try {
			throw new User_defind_exception("this is the user defind exception");

		} catch (User_defind_exception e) {
			// TODO: handle exception
			System.out.println("Catch the exception");
			System.out.println(e.getMessage());
		}
	}

}
