package interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class CommenElementBetweenTwoArray_01 {
	public static void main(String[] args) {
		int arr1[] = { 80, 10, 15, 2, 35, 60 };
		int arr2[] = { 35, 80, 60, 20, 75 };

		printCommonElement(arr1, arr2);
		printUnionElement(arr1,arr2);

	}

	public static void printUnionElement(int[] arr1, int[] arr2) {
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);			
		}
		
		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);
		}
		System.out.println();
		System.out.println("union of the two number");
		
		System.out.println(s);
	}

	private static void printCommonElement(int[] arr1, int[] arr2) {
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}
		System.out.println("The common element is : intersection");
		for (int j = 0; j < arr2.length; j++) {
			if (s.contains(arr2[j])) {
				System.out.print(arr2[j] + ",");
			}
		}

	}

}
