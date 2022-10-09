package interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InterviewQ_13 {

	public static void main(String[] args) {
            List<Integer> number=Arrays.asList(10,20,25,35,40,34);
             number.stream().filter(n->n%2==0).forEach(System.out::println);
            
	}

}
