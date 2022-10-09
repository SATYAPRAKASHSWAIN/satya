package com.sorting;

import java.util.Scanner;

public class Quick_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of element you want to store:");
		int x = sc.nextInt();
		int[] arr = new int[x];
		System.out.println("Enter the element you want to store:");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array is:");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		int temp, min, j;
		System.out.println();
//==================================================================
		int l = 0, h = arr.length;
		int p = arr[(l + h) / 2];
		while (l <= h) {
			while (arr[l] < p) {
				l++;
			}
			while (arr[h] > p) {
				h--;
			}
			if (l <= h) {
				temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
			}
		}

		System.out.println("Quick  sort array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
