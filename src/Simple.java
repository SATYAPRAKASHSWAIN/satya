



abstract class BANK {
	abstract int getRateOfInterest();
}

class Sbi1 extends BANK {
	public int getRateOfInterest() {
		return 7;
	}
}

class PNB extends BANK {
	public int getRateOfInterest() {
		return 8;
	}
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BANK b;
		b = new Sbi1();
		System.out.println("Rate of interest is:" + b.getRateOfInterest());
		b = new PNB();
		System.out.println("RAte of interest is:" + b.getRateOfInterest());

	}

}

