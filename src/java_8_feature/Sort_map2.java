package java_8_feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import java_8_feature_tax.Employee;

public class Sort_map2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		map.put("seven", 7);

		Map<Employee, Integer> list = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		list.put(new Employee(175, "Satya", "IT", 600000), 60);
		list.put(new Employee(176, "Sangram", "Software", 500000), 90);
		list.put(new Employee(177, "Biplab", "engeener", 400000), 50);
		list.put(new Employee(179, "Tarakanta", "service", 700000), 40);
		list.put(new Employee(180, "Rajesh", "Lecture", 800000), 120);

		//System.out.println(list);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		/*
		 * for (Entry<String, Integer> entry : entries) {
		 * System.out.println(entry.getKey() + "  " + entry.getValue()); }
		 */
		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("****************************************************************************");
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		list.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
	}

}
