package com.global_logic.coding;

import java.util.Scanner;

public class InterviewQ_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the four value in below");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		System.out.println(totalStudent(A, B, C, D));

	}

	public static int totalStudent(int A, int B, int C, int D) {
		int result = 0;
		int n = ((A + B) - C);
		result = n + D;
		return result;

	}

}
