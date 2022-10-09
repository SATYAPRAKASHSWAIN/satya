package com.multithreading;

class Mythread1 extends Thread {
	public void run() {
		System.out.println("perofrming mutliple thread at multiple task");
	}
}
class Mythread2 extends Thread {
	public void run() {
		System.out.println("second multiple thread at multiple method");
	}
}
public class Performing_multiple_thread_multiple_task {

	public static void main(String[] args) {
		Mythread1 t = new Mythread1();
		t.start();
		Mythread2 t1 = new Mythread2();
		t1.start();

	}

}
