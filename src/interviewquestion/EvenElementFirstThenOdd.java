package interviewquestion;

public class EvenElementFirstThenOdd {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 5, 4, 7, 8, 11, 20 };
		int[] a = new int[arr1.length];
		int k = 0, k1 = -1;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				a[k] = arr1[i];
				arr1[i] = k1;
				k++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != -1) {
				a[k] = arr1[i];
				k++;
			}

		}
		for (int i : a) {
			System.out.print(i + ",");
		}
	}

}
