package interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
//filter the unique element and sorted in asending order

public class InterViewQ_7 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 4, 3, 2, 0, 4, 6, 7, 8, 5, 4, 3, 9, 5, 4, 3, 6, 7, 6, 6);
		System.out.println(list);

		List<Integer> distinctElements = list.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctElements);

		TreeSet<Integer> sortedOrder = new TreeSet<Integer>(distinctElements);

		System.out.println(sortedOrder);

	}

}
