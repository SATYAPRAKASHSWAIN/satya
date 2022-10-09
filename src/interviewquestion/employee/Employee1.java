package interviewquestion.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee1 {
	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, 10000));
		employee.add(new Employee(2, 20000));
		employee.add(new Employee(3, 30000));
		employee.add(new Employee(4, 40000));
		employee.add(new Employee(5, 50000));
		employee.add(new Employee(6, 60000));
		employee.add(new Employee(7, 70000));
		employee.add(new Employee(8, 80000));
		employee.add(new Employee(9, 90000));

	List<Employee> employeesortedlist=	employee.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
	System.out.println(employeesortedlist);
	
	List<Employee> Top3salary=	employee.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
	System.out.println(Top3salary);
	
	List<Employee> salarylessthan3rdhighest=	employee.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
	System.out.println(salarylessthan3rdhighest);



	}
}