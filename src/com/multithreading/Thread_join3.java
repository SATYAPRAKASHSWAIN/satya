package com.multithreading;

class Medical extends Thread {
	public void run() {
		try {

			System.out.println("Medical starts");
			Thread.sleep(1000);
			System.out.println("Medical completed");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

class officersign extends Thread {
	public void run() {
		try {
			System.out.println("officer take the file");
			Thread.sleep(1000);
			System.out.println("Officer work completed");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class testDrive extends Thread {
	public void run() {
		try {
			System.out.println("test Drive starts");
			Thread.sleep(1000);
			System.out.println("test drive completed");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Thread_join3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Medical m = new Medical();
		m.start();
		
		m.join();
		
		officersign o = new officersign();
		o.start();
		
		o.join();
		
		testDrive t=new testDrive();
		t.start();

	}

}
