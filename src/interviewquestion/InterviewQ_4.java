package interviewquestion;

import java.util.ArrayList;
import java.util.TreeSet;

public class InterviewQ_4 {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(22);
		ar.add(22);
		ar.add(33);
		ar.add(20);
		ar.add(18);
		ar.add(55);
		ar.add(55);
		
		TreeSet<Integer> sort=new TreeSet<Integer>(ar);
		System.out.println(sort);
	}

}
