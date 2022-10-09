package com.collection.durga.sir;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());// 10

		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());// 20

		v.addElement("satyaprakash");
		System.out.println(v);
		v.add("satya");
		System.out.println(v);
		v.add(5, "chiku");
		System.out.println(v);
		v.remove(11);
		System.out.println(v);
		v.removeElement("satyaprakash");
		System.out.println(v);
		v.removeElementAt(7);
		System.out.println("chilku"+v);
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("satya :"+v.get(0));	
		System.out.println(v.elementAt(0));
		System.out.println(v.firstElement());	
		System.out.println(v.lastElement());
		v.clear();
		System.out.println(v);
		//v.removeAllElements();
		System.out.println(v);

	}

}
