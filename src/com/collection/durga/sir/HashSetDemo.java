package com.collection.durga.sir;

import java.util.HashSet;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
          HashSet h=new HashSet();
		//LinkedHashSet h=new LinkedHashSet();
            h.add("B");
            h.add("C");
            h.add("D");
            h.add("Z");
            h.add("10");
            System.out.println(h.add("Z"));//false
            System.out.println(h);
	}
}
