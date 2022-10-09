package com.collection.durga.sir;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
            HashMap m=new HashMap();
            m.put("chiranjeevi", 900);
            m.put("balaiah", 800);
            m.put("venkatesh", 200);
            m.put("nagarjuna", 500);
            m.put("Satya", 600);
            System.out.println(m);
            System.out.println(m.put("chiranjeevi", 8000));
            m.put("chiranjeevi", 1000);
            Set s=m.keySet();
            System.out.println(s);
            Collection c=m.values();
            System.out.println(c);
            Set s1=m.entrySet();
            System.out.println(s1);
            
            Iterator itr=s1.iterator();
            while(itr.hasNext()) {
            	Map.Entry m1=(Map.Entry) itr.next();
            	System.out.println(m1.getKey()+"----"+m1.getValue());
            	if(m1.getKey().equals("Satya")) {
            		m1.setValue(10000);
            	}
            }
            
            
	}

}
