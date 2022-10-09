package com.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTheArrayUsingSortMethod {
	public static void sortArray(int n) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the elements into the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array before sorting :");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println();
		System.out.println("After sorting array using sort() method ,the result is in the fugure:");
		Arrays.sort(a);
		System.out.println(a[1]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int x = sc.nextInt();
		sortArray(x);

	}

}
