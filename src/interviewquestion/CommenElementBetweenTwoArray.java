package interviewquestion;

public class CommenElementBetweenTwoArray {
	public static void main(String[] args) {
		int arr1[] = { 80, 10, 15, 2, 35, 60 };
		int arr2[] = { 35, 80, 60, 20, 75 };

		int input[] = new int[100];
		int k = 0, p = -1;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					input[k] = arr1[i];
					arr1[i] = p;
					k++;
				}

			}

		}
		for (int i = 0; i < k; i++) {
			if (input[i] != p) {
				System.out.print(input[i]+",");
			}

		}

	}

}
