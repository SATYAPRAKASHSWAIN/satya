package com.multithreading;

/*
 Definition=> Which run in the backgound of another Thread
 Use=>        its provides service to the Threads
 Ex=>         Garbegecollection,finalize,Attech listner,signal dispatch
 Methods =>   public final void setDaemon(boolean b)
              public final boolean isDaemon()
              
Program=>     case-1 when ever you create a Daemon thread ,after creating the object then you create Daemon thread,
              then you create start,otherwise it throw illegalThreadException             
              case2-we can not create main thread before daemon thread
 Life=>       Its life depends on the main thread               
 Nature=>     Its inherite the properties from the parent Thread
 JVM rolls on Daemon thread
 Most of the time Daemon Thread has low Lowpriority.but we can change its priority according to its needs
 
 */
public class Daemon_Thread extends Thread {
	public void run() {
		System.out.println("daemon thread");
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Current thread is Daemon thread");
			
		} else {
			System.out.println("Not a daemon thread");

		}
	}

	public static void main(String[] args) {
		System.out.println("main thread");
		Daemon_Thread t = new Daemon_Thread();
		//t.setDaemon(true);
		t.start();
	//	t.setDaemon(true);

	}

}
