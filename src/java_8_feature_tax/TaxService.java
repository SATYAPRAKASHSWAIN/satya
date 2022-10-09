package java_8_feature_tax;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	public static List<Employee> evaluaters(String input) {
		return (input.equalsIgnoreCase("tax"))
				? DataBase.getEmployee().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: DataBase.getEmployee().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluaters("tax"));

	}

}
