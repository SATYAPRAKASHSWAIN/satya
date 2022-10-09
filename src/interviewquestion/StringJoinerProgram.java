package interviewquestion;

import java.util.StringJoiner;
/*
[A,B,C]
P:Q
[A,B,C,P:Q]

 */

public class StringJoinerProgram {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",","[","]");
		sj.add("A").add("B").add("C");
		System.out.println(sj);

		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("P").add("Q");

		System.out.println(sj1);
		sj.merge(sj1);

		System.out.println(sj);

	}

}
