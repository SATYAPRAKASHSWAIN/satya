package com.multithreading;

class Single_task extends Thread {
	public void run() {
		System.out.println("Thread single task");
	}

}

public class Performing_single_task_single_thresd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_task t = new Single_task();
		t.start();

	}

}
