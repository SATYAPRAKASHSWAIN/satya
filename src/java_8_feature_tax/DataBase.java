package java_8_feature_tax;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	public static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(175, "Satya", "IT", 600000));
		list.add(new Employee(176, "Sangram", "Software", 500000));
		list.add(new Employee(177, "Biplab", "engeener", 400000));
		list.add(new Employee(179, "Tarakanta", "service", 700000));
		list.add(new Employee(180, "Rajesh", "Lecture", 800000));

		return list;

	}

}
