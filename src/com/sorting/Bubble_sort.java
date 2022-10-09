package com.sorting;

import java.util.Scanner;

public class Bubble_sort {

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
		int temp;
		System.out.println();
//=======================================================================
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = i; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 1) {
				break;
			}

		}

		System.out.println("Bubble sort array is:");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
