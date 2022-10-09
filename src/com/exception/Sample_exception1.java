package com.exception;

public class Sample_exception1 {
	public static void validity(int n) throws Exception {

		if (n >= 18) {
			System.out.println("Person is eligible for voting");
		} else {
			throw new Exception("Person is not eligibility for voting");
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		validity(13);
	}

}
