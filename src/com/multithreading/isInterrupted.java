package com.multithreading;

public class isInterrupted extends Thread {
	public void run() {
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try {
			for (int i = 1; i <=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
				System.out.println(Thread.currentThread().isInterrupted());
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("interrupted method" + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isInterrupted i = new isInterrupted();
		i.start();
		i.interrupt();
		//System.out.println("satya");
	}

}
