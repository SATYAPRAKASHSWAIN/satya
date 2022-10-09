package java_8_feature;

import java.util.function.Predicate;

public class PredicateDemo_1 implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = new PredicateDemo_1();

		System.out.println(predicate.test(4));

	}

}
