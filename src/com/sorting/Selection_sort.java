package com.sorting;

import java.util.Scanner;

public class Selection_sort {

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
		int temp, min;
		System.out.println();
//=========================================================================
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i+1; j < arr.length ; j++) {
				if (arr[min] > arr[j]) {

					min = j;
				}
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		System.out.println("Selection sort array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
