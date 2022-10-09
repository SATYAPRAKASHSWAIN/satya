package com.collection.durga.sir;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList I = new LinkedList();
		I.add("balakrishna");
		I.add("venki");
		I.add("chiru");
		I.add("nag");
		System.out.println(I);// [balakrishna,venki,chiru,nag]
		ListIterator itr = I.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("venki")) {
				itr.remove();// [balakrishna,chiru,nag]
			} else if (s.equals("nag")) {
				itr.add("chiru");// [balakrishna,chiru,nag
			} else if (s.equals("chiru")) {
				itr.set("charan");// [balakrishna,charu,nag,chiru]
			}
		}
		System.out.println(I);// [balakrishna,charan,nag,chiru]
	}

}
