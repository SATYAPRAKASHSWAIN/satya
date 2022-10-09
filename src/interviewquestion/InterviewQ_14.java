package interviewquestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewQ_14 {

	public static void main(String[] args) {
        List<Integer> number=Arrays.asList(10,12,13,12,24,24,45,26,28);
        
        Set<Integer> h=new HashSet<Integer>();
        
        //find duplicate element in a list 
        number.stream().filter(n ->!h.add(n)).forEach(System.out::println);
		
		
		
	}

}
