package interviewquestion;

import java.util.Scanner;

public class InterviewQ_1 {
	public static String StringChallenge(String str) {
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return " not palindrom";
			}
		}
		return "palindrom";
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string you want to check:");
		System.out.println(StringChallenge(s.nextLine()));
	}

}
