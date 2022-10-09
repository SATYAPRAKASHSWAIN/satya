package interviewquestion;

import java.util.Scanner;

public class InterviewQ_17 {
	public static boolean isPalindrom(String str) {
		boolean flag = true;
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static String[] Lpalindrom(String str) {
		String[] words = str.split(" ");
		int count = 0;
		String[] string = new String[2];

		for (int i = 0; i < words.length; i++) {
			if (isPalindrom(words[i])) {
				int length = words[i].length();
				if (count < length) {// maximum palindrom words
					count = length;
					string[0] = words[i];
				}
				if (count < length) {// minimum palindrom words
					count = length;
				} else {
					string[1] = words[i];
				}
			}
		}
		String[] string1 = {string[0], string[1] };
		return string1;

//		System.out.println("Maximum palindrom subString is :" + string[0]);
//		System.out.println("Minimum palindrom subString is :" + string[1]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter the String you want to check whether the enter String is largest and smallest  palindrom ");
		String[] string2 = Lpalindrom(sc.nextLine());
		for (String string : string2) {
			int k = 1;
			if (k == 1) {
				System.out.println("Maximum palindrom subString is :"+string);
				k++;
			} else {
				System.out.println("Minimum palindrom subString is :" +string);
			}
		}
	}

}
