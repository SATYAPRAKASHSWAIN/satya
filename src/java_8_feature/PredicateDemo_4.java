package java_8_feature;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo_4 {

	public static void main(String[] args) {
            List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            list1.stream().filter(t -> t%2==0).forEach(t ->System.out.println("print number"+t));
	}

}
