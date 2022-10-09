package com.collection.durga.sir;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 
 * write a program to insert into integer object to treeset 
where teh sorting order is desending order.

*/
public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Mycomparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(120);
		t.add(20);
		t.add(30);
		System.out.println(t);

	}

}

class Mycomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else
			return 0;
	}

}