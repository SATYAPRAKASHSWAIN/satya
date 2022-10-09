package com.collection.durga.sir;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList i = new ArrayList();
		for (int j = 0; j <= 10; j++) {
			i.add(j);
		}
		System.out.println(i);
		Iterator itr = i.iterator();
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0) {
				System.out.println(I);
			} else {
				itr.remove();
			}
		}
		System.out.println(i);

	}

}
