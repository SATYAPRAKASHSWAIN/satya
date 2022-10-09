package com.practice.array;

import java.util.Scanner;

public class CopyOneArrayToAnotherArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x=sc.nextInt();
		int a[]= new int[x];
		int b[]=new int[a.length];
		System.out.println("Enter the element to store the element");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Before copy array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int j=0;j<a.length;j++) {
			b[j]=a[j];
		}
		System.out.println("After copy array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
		
		
	}

}
