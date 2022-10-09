package com.practice.array;

import java.util.Scanner;

public class MaxMinElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the element to the string");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int max = array[0], min = array[0], temp;
		for (int i = 0; i < array.length-1; i++) {
			if (max < array[i + 1]) {
				temp = array[i + 1];
				array[i + 1] = max;
				max = temp;
			}
		}
		System.out.println("Maximum no in the array" + max);

		for (int i = 0; i < array.length-1; i++) {
			if (min > array[i + 1]) {
				temp = array[i + 1];
				array[i + 1] = min;
				min = temp;
			}
		}
		System.out.println("Maximum no in the array" + min);
	}
}
