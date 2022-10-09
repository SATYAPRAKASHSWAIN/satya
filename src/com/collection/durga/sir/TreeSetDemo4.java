package com.collection.durga.sir;

import java.util.Comparator;
import java.util.TreeSet;

/*
Write program insert into string buffer object into the tree set where
sorting order is alphabetical order.
*/
public class TreeSetDemo4 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("N"));
		System.out.println(t);
	}
}
class MyComparator2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		//return s1.compareTo(s2);
		return s1.compareTo(s2);		

	}
	
}
