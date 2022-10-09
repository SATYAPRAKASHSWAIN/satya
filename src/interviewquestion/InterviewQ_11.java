package interviewquestion;

public class InterviewQ_11 {

	public static void main(String[] args) {
		int[] arr = {10, 0, 12, 34, 0, 56, 34, 0, 68, 23, 0, 56, 78, 0, 54};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

}
