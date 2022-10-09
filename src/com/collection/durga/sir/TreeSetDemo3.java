package com.collection.durga.sir;

import java.util.Comparator;
import java.util.TreeSet;

/* 
 *   write a program to insert  string object should be into the
    TreeSEt where all element should be inserted according to alphabetical order.
*/
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Mycomparator1());
		t.add("biplab");
		t.add("kini");
		t.add("satya");
		t.add("sangram");
		t.add("padia");
		System.out.println(t);
	}
}
class Mycomparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = (String) o1;
		String s2 = (String) o2;

		//return s2.compareTo(s1);
		return s1.compareTo(s2);

	}

}
