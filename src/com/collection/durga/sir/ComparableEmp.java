package com.collection.durga.sir;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
String name;
int eid;

	public Employee(String name, int eid) {
	super();
	this.name = name;
	this.eid = eid;
}
public String toString() {
	return name +"--"+ eid;
} 
	@Override
	public int compareTo(Object o) {
       int eid1=this.eid;
       Employee e=(Employee) o;
       int eid2=e.eid;
       if(eid1<eid2)
    	   return -1;
       else if(eid1>eid2)
    	   return +1;
       else
		return 0;
	}
	
}
public class ComparableEmp {
	public static void main(String[] args) {
		   Employee e1=new Employee("nag",100);
		   Employee e2=new Employee("balaiah",200);
		   Employee e3=new Employee("chiru",50);
		   Employee e4=new Employee("venki",150);
		   Employee e5=new Employee("nag",100);
		   
		   TreeSet t=new TreeSet();
		   t.add(e1);
		   t.add(e2);
		   t.add(e3);
		   t.add(e4);
		   t.add(e5);
		   System.out.println(t);
		   
		   TreeSet t1=new TreeSet(new Mycomparator6()); 
		   
		   t1.add(e1);
		   t1.add(e2);
		   t1.add(e3);
		   t1.add(e4);
		   t1.add(e5);	
		   System.out.println(t1);
	}
}
class Mycomparator6 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	
}
