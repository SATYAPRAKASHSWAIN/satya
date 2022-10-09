package com.collection.durga.sir;



public class ComparableDemo {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));// -ve iff obj1 has to come before obj2
		System.out.println("Z".compareTo("A"));// +ve iff obj1 has to come after obj2
		//System.out.println("A".compareTo(null));//null pointer exception
		System.out.println("A".compareTo("A"));// 0 iff boj1 has equal to obj2

		
	}

}
