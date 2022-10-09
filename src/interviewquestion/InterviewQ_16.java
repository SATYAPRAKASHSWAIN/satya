package interviewquestion;

import java.util.Scanner;

public class InterviewQ_16 {
	public static String StringChalenge(String string) {
		String[] words = string.split(" ");
		int count = 0, i;
		String word = "-1";
		for (i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				int counterWord = 0;
				for (int j2 = j + 1; j2 < words[i].length(); j2++) {
					if (words[i].charAt(j) == words[i].charAt(j2)) {
						counterWord++;
					}
					if (counterWord > count) {
						count = counterWord;
						word = words[i];
					}
				}
			}

		}
		return word;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check the reating letter in the word");
		System.out.println(StringChalenge(sc.nextLine()));
	}
	
}
