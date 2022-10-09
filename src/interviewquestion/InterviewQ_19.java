package interviewquestion;

public class InterviewQ_19 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 3 };
		int maxSum = 0, minSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			maxSum += arr[i + 1];
			minSum += arr[i];
		}
		System.out.println("maximum sum of the integer array is :"+maxSum);
		System.out.println("minimum sum of the integer array is :"+minSum);
		System.out.println("maximum number in the given string is :"+arr[arr.length-1]);
		System.out.println("minimum number in the given string is :"+arr[0]);

	}

}
