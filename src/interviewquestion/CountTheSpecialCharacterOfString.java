package interviewquestion;

public class CountTheSpecialCharacterOfString {
	public static void main(String[] args) {
		String s = "Satyaprakash Swain @#$$%^^";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i))
					&& !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			}

		}
		System.out.println("Special charcater of the givern string is :" + count);
	}
}
