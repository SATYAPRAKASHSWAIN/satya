package com.oops.concept.abstrction;

interface Bank {
	float getInterest();
}

class SBI implements Bank {
	public float getInterest() {
		return 34.4f;
	}
}

class ICICI implements Bank {
	public float getInterest() {
		return 56.45f;
	}
}

class Axis implements Bank {
	public float getInterest() {
		return 34.3f;
	}
}

public class Create_bankInterface_bankdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest of SBI bank is:" + b.getInterest());
		b = new ICICI();
		System.out.println("Rate of Interest of ICICI bank is" + b.getInterest());
		b = new Axis();
		System.out.println("Rate of Interest os axis bank is:" + b.getInterest());

	}

}
