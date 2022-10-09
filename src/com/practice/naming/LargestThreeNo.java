package com.practice.naming;

import java.util.Scanner;

public class LargestThreeNo {
	public static void largestNo(int n1, int n2, int n3) {
		while (n1 != 0 && n2 != 0 && n3 != 0) {
			if (n1 > n2 && n1 > n3) {
				System.out.println("Largest no is" + n1);
				break;
			} else if (n2 > n3 && n2 > n1) {
				System.out.println("Largest no is" + n2);
				break;
			} else if (n3 > n1 && n3 > n2) {
				System.out.println("Largest no is" + n3);
				break;
			} else {
				System.out.println("Invalid input");
				break;
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three no you want to a check ,which no is largest");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		largestNo(x, y, z);
	}

}
