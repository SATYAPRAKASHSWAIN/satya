package interviewquestion;

import java.util.Scanner;

public class InterviewQ_18 {
	public static char[] lReapingCharacter(String str) {

		int large = 0;
		int minCharacter = 1;
		char[] c = new char[10];
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
		

			if (large < count) {
				large = count;
				c[0] = str.charAt(i);
			}
			c[1] = str.charAt(0);
             
		}
		char c1[] = { c[0], c[1] };
		return c1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to check ,the longest repeating character in that String");
		char[] ch = lReapingCharacter(sc.nextLine());
		int k = 1;
		for (char c : ch) {
			System.out.println(c);

		}
	}

}
