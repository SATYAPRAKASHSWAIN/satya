package com.multithreading;

public class Thread_priority extends Thread {
	public void run() {
		System.out.println("child Thread");
		System.out.println("Child THread priority"+Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		System.out.println("main thread old priority"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("mani thread new priority is:"+Thread.currentThread().getPriority());
		Thread_priority t = new Thread_priority();
		t.setPriority(10);
		t.start();
	}

}
