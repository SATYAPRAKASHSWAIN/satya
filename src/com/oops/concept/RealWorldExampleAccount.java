package com.oops.concept;

class Account {
	int acc_no;
	String name;
	int amount;

	public void insert(int a, String s, int a1) {
		acc_no = a;
		name = s;
		amount = a1;
	}

	public void checkBalance() {
		System.out.println("Balance is :" + amount);
	}

	public void diposite(int am) {
		amount = amount + am;
		System.out.println(am + "is diposoted successfully!");
	}

	public void withdraw(int a1) {
		if (amount > a1) {
			amount = amount - a1;
			System.out.println("Amount" + a1 + "is withdral succesfully");
		} else {
			System.out.println("Insuficiant balanace!");
			}
	}
	public void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
}

public class RealWorldExampleAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.insert(12345, "Satyaprakash", 4000);
		a.display();
		a.checkBalance();
		a.diposite(4000);
		a.checkBalance();
		a.withdraw(1000);
		a.checkBalance();

	}

}
