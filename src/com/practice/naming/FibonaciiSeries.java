package com.practice.naming;

public class FibonaciiSeries {
	public static void fiboSeries(int n) {
		int a = 0, b = 1, c;
		System.out.print(a + " ,"+b+" \t");
		for (int d = 3; d <= n; d++) {
			c = a + b;
			System.out.print(c + ",\t");
			a = b;
			b = c;
		}
		System.out.println();
	}

	public static void fibonacii(int n1) {
		int a = 0, b = 1, c=0;
		if (n1 == 1) {
			System.out.println(a);
		} else if (n1 == 2) {
			System.out.println(a + " " + b);
		} else if (n1 > 2) {
			System.out.print(a +","+ b+",\t" );
			for (int d = 3; d <n1; d++) {
				
				if(c<=d) {
					c = a + b;
					System.out.print(c + ",\t");
				}
				
				a = b;
				b = c;
			}

		} else {
			System.out.println("Invalid output!");
		}

	}

	public static void main(String[] args) {
		System.out.println("The fibonacii series are :");
		fiboSeries(10);
		fibonacii(10);

	}

}
