package java_8_feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java_8_feature_tax.DataBase;
import java_8_feature_tax.Employee;

public class Sort_list {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(6);
		List<Employee> employees = DataBase.getEmployee();

		/*
		 * Collections .sort(employees,new Mycomparator());
		 * 
		 * System.out.println(employees);
		 */
		/*
		 * Collections.sort(employees, new Comparator<Employee>() { public int
		 * compare(Employee o1, Employee o2) { return (int) (o1.getSalary() -
		 * o2.getSalary()); } });
		 */

		/*
		 * Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() -
		 * o2.getSalary()));
		 */

		//System.out.println(employees);
		
		
		/*
		 * employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() -
		 * o2.getSalary())).forEach(System.out::print);
		 */
		
		/*
		 * employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach
		 * (System.out::print);
		 */
		
		/*
		 * employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(
		 * System.out::print);
		 */
		
		/*
		 * Collections.sort(list); Collections.reverse(list);
		 * //System.out.println(list);
		 * 
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s
		 * +","));//decending
		 * list.stream().sorted().forEach(s->System.out.print(s+","));//assending order
		 * 
		 */

	}

}

/*
 * class Mycomparator implements Comparator<Employee> {
 * 
 * @Override public int compare(Employee o1, Employee o2) {
 * 
 * return (int) (o1.getSalary() - o2.getSalary()); }
 * 
 * }
 */
