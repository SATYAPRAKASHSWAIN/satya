package com.global_logic.coding;

import java.util.*;

public class InterviewQ_3 {
	public static int elementFrequency(int N, int M, int[] A) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!mp.containsKey(A[i]))
				mp.put(A[i], 0);

			mp.put(A[i], mp.get(A[i]) + 1);
		}
		int result = 0;
		for (Map.Entry<Integer, Integer> kvp : mp.entrySet()) {
			if (kvp.getValue() < M) {
				result += M - kvp.getValue();
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check the frequecy of the letter");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(elementFrequency(N, M, A));

	}
}
