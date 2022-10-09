package com.oops.concept.inheritance;

class satya {
	void satia() {
		System.out.println("Satya the name of quality");
	}
}

class chiku extends satya {
	void satiaa() {
		System.out.println("chiku is the cute name");
	}
}

class chikua extends satya {
	void sata() {
		System.out.println("chikua is the nick name of satya");
	}
}

public class Hierarchical_inheritance {
	public static void main(String[] args) {
		chikua c = new chikua();
		c.sata();
		c.satia();
		chiku s = new chiku();
		s.satia();
		s.satiaa();

	}

}
