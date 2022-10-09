package interviewquestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InterviewQ_15 {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10, 12, 13, 15, 16, 5, 3, 6, 4, 8, 9);

		number.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


	}

}
