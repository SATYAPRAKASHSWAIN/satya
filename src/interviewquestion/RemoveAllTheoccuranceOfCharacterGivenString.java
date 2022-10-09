package interviewquestion;

import java.util.Scanner;

public class RemoveAllTheoccuranceOfCharacterGivenString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to remove the occurance of the perticular character");
		System.out.println(removeThePerticularCharGivenString(sc.nextLine()));
	}

	public static String removeThePerticularCharGivenString(String string) {
		String str=" ";
		for (int i = 0; i <string.length(); i++) {
			if(string.charAt(i)!='c') {
				str +=string.charAt(i);
			}
		}
		return str;
	}

}
