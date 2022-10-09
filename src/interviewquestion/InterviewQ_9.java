package interviewquestion;

public class InterviewQ_9 {
	public static void main(String[] args) {
		int[] arr = { 22, 22, 23, 2, 56, 78, 66, 52, 34, 56, 24, 24, 7 };
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (((arr[i] + arr[j]) == 9) && (k == 1)) {
					System.out.println("Two no is:" + i + " " + j);
					k++;
					break;

				}

			}

		}
	}

}
