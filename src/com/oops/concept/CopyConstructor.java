package com.oops.concept;

class Success {
	int id;
	String name;

	Success(int n, String s) {
		id = n;
		name = s;
		System.out.println("Copy constructor is currently activated!");
	}

	public Success(Success sc) {
		// TODO Auto-generated constructor stub
		this.name=sc.name;
		this.id=sc.id;
	}

	void display() {
		System.out.println(id + "  " + name);
	}
}

public class CopyConstructor {
	public static void main(String[] args) {
		Success sc = new Success(1, "Satya");
		Success sc1 = new Success(sc);
		sc.display();
		sc1.display();
	}

}
