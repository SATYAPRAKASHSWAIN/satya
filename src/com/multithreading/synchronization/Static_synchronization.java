package com.multithreading.synchronization;

class BookThreadSeat {
	static int total_seat = 20;

	 synchronized static void BookSeat(int seats) {

		
		if (total_seat >= seats) {
			System.out.println(seats+" Seat book successfully!");
			total_seat = total_seat - seats;
			System.out.println("seat left" + total_seat);

		} else {
			System.out.println("Sorry seat are not book");
			System.out.println("Total seat" + total_seat);

		}
	}
}

class Mythread1 extends Thread {
	BookThreadSeat b;
	int seats;

	Mythread1(BookThreadSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.BookSeat(seats);
	}

}

class Mythread2 extends Thread {
	BookThreadSeat b;
	int seats;

	Mythread2(BookThreadSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.BookSeat(seats);
	}

}

class Static_synchronization extends Thread {
	BookThreadSeat b;
	int seats;

	Static_synchronization(BookThreadSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.BookSeat(seats);
	}

	public static void main(String[] args) {
		BookThreadSeat b=new BookThreadSeat();
		Mythread1 m=new Mythread1(b, 7);
		m.start();
		
		Mythread2 m2=new Mythread2(b, 7);
		m2.start();

		Static_synchronization s=new Static_synchronization(b, 4);
		s.start();
		
		//------------------------------
		
		BookThreadSeat b1=new BookThreadSeat();
		Mythread1 m1=new Mythread1(b1, 7);
		m1.start();
		
		Mythread2 m3=new Mythread2(b1, 7);
		m3.start();

		Static_synchronization s1=new Static_synchronization(b1, 4);
		s1.start();
		
		
		
		
		
		

	}

}
