package com.oops.concept;
class counter{
	static int count;
	//int coount=0;
	counter(){
		count++;
		System.out.println(count);
	}
}
public class Static_counter {
	public static void main(String[] args) {
		counter cr=new counter();
		counter cr1=new counter();
		counter c2r=new counter();
		counter cr3=new counter();
	}

}
