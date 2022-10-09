package com.collection.list;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("satya");
		list.add("pranab");
		list.add("chita");
		list.add("biplab");
		
		System.out.println(list);
		Iterator itr=list.iterator();
		//while loop
		 while(itr.hasNext()) {  
			   System.out.println(itr.next());
			  }  
		 //for each loop
		 for(String fruit:list)    
			    System.out.println(fruit);   
		 System.out.println("Get the first element: "+list.get(1));
		 list.set(2, "satya");
		 System.out.println(list);
		

	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

}
