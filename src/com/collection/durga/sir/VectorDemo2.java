package com.collection.durga.sir;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector v = new Vector(20);
		System.out.println(v.capacity());
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);

		}
		System.out.println(v.capacity());
		v.addElement("Satyaprakash Swain");
		System.out.println(v);

	}

}
