package com.practice.naming;

import java.util.Scanner;

public class PerfectSquareNo {
	public static void perSquareNo(int n) {
		 double y = Math.sqrt(n);
		if (y == (int) y) {
			System.out.println("Enter no " + n + " perfect square");
		} else {
			System.out.println("Enter no " + n + " not a perfect square");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no you want to check whether the no is perfect square or not");
		int x = sc.nextInt();
		perSquareNo(x);
	}

}
