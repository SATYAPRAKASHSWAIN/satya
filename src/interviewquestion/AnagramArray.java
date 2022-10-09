package interviewquestion;

import java.util.Arrays;

public class AnagramArray {
	public static void main(String[] args) {
		int arr1[] = { 3, 2, 5, 7 };
		int arr2[] = { 2, 3, 5, 7 };
		if (arr1.length != arr2.length) {
			System.out.println("two integer array is not angram");
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for (int i = 0; i < arr2.length; i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("two array is not anagram");
					break;
				}
			}
			System.out.println("two array is anagram");
          
			
		}
	}

}
