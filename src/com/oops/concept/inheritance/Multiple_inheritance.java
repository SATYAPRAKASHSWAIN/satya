package com.oops.concept.inheritance;

interface satya435435 {
	int r = 323;
}

interface chiku342 extends satya435435 {
	int l = 233;
}

interface chiku1 extends chiku342 {
	int p = 32354;
	String s="Satya, the name of quality";
}

interface chikuna extends chiku1, chiku342 {
	int k = 343;

}

public interface Multiple_inheritance {
	public static void main(String[] args) {
		chikuna c = new chikuna() {
		};
		System.out.println(c.r);
		System.out.println(c.k);
		System.out.println(c.p);
		System.out.println(c.l);
		System.out.println(c.s);


	}

}
