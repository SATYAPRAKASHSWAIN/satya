package interviewquestion;

import java.util.Arrays;
import java.util.List;

public class InterviewQ_5 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10, 22, 11, 14, 15, 16, 24, 14, 13);
		number.stream().map(s -> s + ",").filter(s -> s.startsWith("1")).forEach(System.out::print);
	}

}
