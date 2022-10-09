package com.multithreading;

public class Thread_join2 extends Thread {
	static Thread t1 ;
	public void run() {
		 
		// t1.join();

		try {
			t1.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread" + i);
				Thread.sleep(10000);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 t1 = Thread.currentThread();
//			t1.start();
		Thread_join2 t = new Thread_join2();
		t.start();
		

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("paraent thread" + i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
