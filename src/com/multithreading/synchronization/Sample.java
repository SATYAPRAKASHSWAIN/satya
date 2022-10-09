package com.multithreading.synchronization;

class CinemalHall {
	int total_seat = 10;
	public int seats;

	void left(int seats) {

		System.out.println("Hi" + Thread.currentThread().getName());
		System.out.println("Hi" + Thread.currentThread().getName());
		System.out.println("Hi" + Thread.currentThread().getName());
		System.out.println("Hi" + Thread.currentThread().getName());
		synchronized (this) {

			if (total_seat >= seats) {
				System.out.println(seats + "  Seats book successfully");
				total_seat = total_seat - seats;
				System.out.println("Total seats left   :" + total_seat);
			} else {
				System.out.println("Sorry seat can not be book  :");
				System.out.println("Total_seats left are :" + total_seat);
			}
		}
		System.out.println("Hi" + Thread.currentThread().getName());
		System.out.println("Hi" + Thread.currentThread().getName());
		System.out.println("Hi" + Thread.currentThread().getName());
		System.out.println("Hi" + Thread.currentThread().getName());
	}
}

public class Sample extends Thread {
	static CinemalHall c;
	int seats;

	public void run() {
		c.left(seats);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c = new CinemalHall();
		Sample s = new Sample();
		s.seats = 6;
		s.start();

		Sample s1 = new Sample();
		s1.seats = 6;
		s1.start();

	}

}
