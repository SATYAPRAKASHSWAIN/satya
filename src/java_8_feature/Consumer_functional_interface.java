package java_8_feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_functional_interface {
	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer = t -> System.out.println("print :" + t);
		 * consumer.accept(10);
		 */
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		
		list1.stream().forEach(t->System.out.println("print :"+t));
	}

}
