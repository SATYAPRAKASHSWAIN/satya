package com.multithreading;

public class Performing_single_task_multiple_thread extends Thread {
	public void run() {
		System.out.println("Porforming single task in a multiple thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Performing_single_task_multiple_thread t = new Performing_single_task_multiple_thread();
		Performing_single_task_multiple_thread t1 = new Performing_single_task_multiple_thread();
		t.start();
		t1.start();
	}

}
