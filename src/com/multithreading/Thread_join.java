package com.multithreading;

public class Thread_join extends Thread {
	public void run() {
		try {

			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread_join t = new Thread_join();
		t.start();
		t.join();
try {
	for(int i=0;i<=5;i++) {
		System.out.println("parent thread"+i);
		Thread.sleep(1000);
	}
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
