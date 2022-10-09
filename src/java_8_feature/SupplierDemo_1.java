package java_8_feature;

import java.util.function.Supplier;

public class SupplierDemo_1 implements Supplier<String> {
	@Override
	public String get() {
		return "Satyaprakash Swain";
	}

	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierDemo_1();
		System.out.println(supplier.get());

	}

}
