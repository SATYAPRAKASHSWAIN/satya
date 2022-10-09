package com.exception;

public class Finaliy_block_when_exception_occured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println("Length of the string is:"+s.length());
			
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("null pointer exception is occured");
			
		}
		finally {
			System.out.println("Finally block is always executed.what ever did , it's not matter");
		}

	}

}
