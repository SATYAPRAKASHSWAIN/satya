package java_8_feature;

import java.util.function.Predicate;

public class PredicateDemo_3 {

	public static void main(String[] args) {
		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(5));
	}

}
