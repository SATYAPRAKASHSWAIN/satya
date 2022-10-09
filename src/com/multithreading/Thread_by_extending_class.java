package com.multithreading;

class Test extends Thread {
	public void run() {
		System.out.println("Thread  extends class is running!");
	}
}

public class Thread_by_extending_class {
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		t.start();

	}

}
