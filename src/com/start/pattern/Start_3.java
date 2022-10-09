package com.start.pattern;

public class Start_3 {
	public static void main(String[] args) {
		int number = 5;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if ((i == 0 && j == 0)) {
					System.out.print("1");
				} else if (i == 1 && j == 0) {
					System.out.print("23");
				} else if (i == 2 && j == 0) {
					System.out.print("456");
				} else if (i == 3 && j == 0) {
					System.out.print("78910");
				} else if (i == 4 && j == 0) {
					System.out.print("1112131415");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
