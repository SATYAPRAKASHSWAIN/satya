package java_8_feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo_2 {

	public static void main(String[] args) {
		//Supplier<String> supplier = () -> "Satyaprakash swain the son of pradeep swain";
		//System.out.println(supplier.get());
		List<String> list1=Arrays.asList("satya","b");
		System.out.println(list1.stream().findAny().orElseGet(() -> "Satyaprakash swain the son of pradeep swain"));
	}

}
