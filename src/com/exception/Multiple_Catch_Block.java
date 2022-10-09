package com.exception;

public class Multiple_Catch_Block {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
		} catch (ArithmeticException e) {
			System.out.println(" ArithmeticException occure! ");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception  occure!");
			
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException  occure!");
			
		}
		catch (Exception e) {
			System.out.println("Parent Exception  occure!");
			
		}
		System.out.println("Satya you are the best one.you can achive many more!");
	}

}
//Note:- Parent class exception always written int last of catch block in case of multiple try catch block is present