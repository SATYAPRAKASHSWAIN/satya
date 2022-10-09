package com.multithreading;

public class Thread_yield extends Thread {
	public void run() {
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	public static void main(String[] args) {
		Thread_yield t = new Thread_yield();
		t.start();
//		Thread.yield();if you want to main method stop and provide chance to other thread exceution

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}

	}

}
