package com.collection.durga.sir;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);//[A, B, C, D]
		System.out.println(s.search("A"));//4
		System.out.println(s.search("z"));//-1
		
		s.pop();
		System.out.println(s);
		System.out.println(s.pop());// to remove and return top of the stack
		//s.pop();
		//System.out.println(s);
		//s.peek();
		System.out.println(s.peek());//to return top  of the stack without removal
		System.out.println(s.empty());
		System.out.println(s.isEmpty());



	}

}
