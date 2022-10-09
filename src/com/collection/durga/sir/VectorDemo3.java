package com.collection.durga.sir;

import java.util.Vector;

public class VectorDemo3 {
	public static void main(String[] args) {
		Vector v = new Vector(10, 5);
		System.out.println(v.capacity()); // 10
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity()); // 15
		v.addElement("A");
		System.out.println(v.capacity()); // 15
		System.out.println(v); // [1,2,3,4,5,6,7,8,9,10,A]

	}

}
