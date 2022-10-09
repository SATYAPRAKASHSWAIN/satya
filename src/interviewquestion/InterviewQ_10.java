package interviewquestion;

public class InterviewQ_10 {

	public static void main(String[] args) {
		String str = "I LIKE A BEAUTIFULL WORLD";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].length() < words[j].length()) {
					String t = words[i];
					words[i] = words[j];
					words[j] = t;

				}
			}
		}
		for (String string : words) {
			System.out.print(string+" ");
		}
	}

}
