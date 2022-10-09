package com.multithreading;

public class Thread_constructor_getName_setName extends Thread {
	public void run() {
		System.out.println("Thread task is executed by:" + Thread.currentThread().getName());
	}

	public static void main(String[] satya) {// Thread1,Allways main method is the main thread of the class
		Thread_constructor_getName_setName t = new Thread_constructor_getName_setName();
		t.start();
		System.out.println("Satya");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Satya");
		System.out.println("New Thread name" + Thread.currentThread().getName());
		Thread_constructor_getName_setName t1 = new Thread_constructor_getName_setName();
		t1.setName("Satyaprakash");
		t1.start();
		Thread_constructor_getName_setName t2 = new Thread_constructor_getName_setName();
		t2.start();
	}

}
