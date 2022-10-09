package com.sorting;

import java.util.Scanner;

public class Insertion_sort {

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
		// =============================================================================================
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}

		System.out.println("Selection sort array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
