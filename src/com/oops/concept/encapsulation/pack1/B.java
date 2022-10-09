package com.oops.concept.encapsulation.pack1;

//import com.oops.concept.encapsulation.pack.A;//import package.classname
import com.oops.concept.encapsulation.pack.*;//==>import package.*

 class B extends A {
	 public static void main(String[] args) {
		B obj= new B();
		 //com.oops.concept.encapsulation.pack.A obj=new com.oops.concept.encapsulation.pack.A();//fully qualified name
		
		obj.msg();
	}
	

}
