package com.global_logic.coding;

import java.util.Scanner;

public class InterviewQ_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check the number of operation:");
		int N=sc.nextInt();
		int K=0,result=0;
		int L=(3*3);
		while(N != K && K<N) {
			result++;
			if(L%2==0 || L%3==0) {
				K=K+L; //9
				L=(2*2);
			}else {
				System.out.println(-1);
			}
			
		}
		System.out.println(result);
	}

}
