package com.collection.durga.sir;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);// [A,10,a,null]
		l.remove(2);
		System.out.println(l);
		l.add(2, "M");
		l.add("N");
		System.out.println(l);// [A,10,M,null]

		System.out.println(l instanceof Serializable);// true
		System.out.println(l instanceof Cloneable);// true
		System.out.println(l instanceof RandomAccess);// true

	}

}
