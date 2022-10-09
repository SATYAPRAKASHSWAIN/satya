package com.oops.concept.inheritance;
class Human{
	 void eat() {
		System.out.println("Human always eat animal and vegitable");
	}
}class man extends Human{
	  void eat1(){
		System.out.println("Men are very much hard in heart");
	}
}class woman extends man{
	void eat2() {
		System.out.println("woman are very much soft in heart");
	}
}
public class Multilevel_inheritance {
public static void main(String[] args) {
	woman w=new woman();
	w.eat();
	w.eat1();
	w.eat2();
	//Human.eat();
}
}
