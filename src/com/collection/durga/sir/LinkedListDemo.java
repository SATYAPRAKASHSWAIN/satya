package com.collection.durga.sir;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
         LinkedList l=new LinkedList();
         l.add("durga");
         l.add(30);
         l.add(null);
         l.add("durga");
         System.out.println(l);
         l.set(0, "software");
         System.out.println(l);
         l.addFirst("ccc");
         System.out.println(l);
         l.addLast("Satyaprakash");
         System.out.println(l);
	}

}
