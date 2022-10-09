package com.practice.array;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 6, 4, 2, 2, 3, 3, 324, 23, 324, 1 };
		int[] b = new int[a.length];
		int i, j, visit = -1;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != visit) {
					System.out.print(a[i] + ",");
					a[j] = visit;
					break;
				}

			}
		}

	}

}
