package interviewquestion;

import java.util.Scanner;

public class InterviewQ_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string and check the work of the string is palindrom or not");
		String str = sc.nextLine();
		String[] word = str.split(" ");
		for (String string : word) {
			if (isPalindrom(string))
				System.out.println(string + ": word is palindrom");
		}
	}
	public static boolean isPalindrom(String str) {
		boolean flag = true;
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
