package com.oops.concept.polymorphism;

class Instagram{
	//final void run()
	void run()
	{
		System.out.println("Final method cann't override");
	}
}class faceBook extends Instagram{
	void run() {
		System.out.println("Final method cann't be overriden");
	}
	
}

public class Final_method_notOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		faceBook fb=new faceBook();
		fb.run();

	}

}
