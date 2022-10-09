package com.multithreading;

public class Interrupted_Thread extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Thread interrupted  :" + e);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interrupted_Thread t = new Interrupted_Thread();
		t.start();
		t.interrupt();

	}

}
//interrupted thread  will only works when the thread is in sleep or waiting state(sleep() or wait())