package com.multithreading;

class Test1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread by implementing runnable interface! ");
	}

}

public class Thread_By_implementing_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		Thread th = new Thread(t);
		th.start();

	}

}
