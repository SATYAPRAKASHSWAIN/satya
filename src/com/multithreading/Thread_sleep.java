package com.multithreading;

class Mythread extends Thread{
	public void run(){
		for(int i=0;i<=5;i++) {
			try {
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class Thread_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread m=new Mythread();
		//m.start();
		m.run();
		
		Mythread m1=new Mythread();
		//m1.start();
		m1.run();

	}

}
