package interviewquestion.employee1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

class Employee {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}

public class InterviewQ_9 {
	static List<Employee> employeelist = new ArrayList<Employee>();

	public static void main(String[] args) {
		employeelist.add(new Employee(111, "Satya", 24, "male", "HR", 2011, 2500.00));
		employeelist.add(new Employee(112, "Prakash", 25, "male", "SE", 2015, 2600.00));
		employeelist.add(new Employee(113, "Smruti", 24, "Female", "PE", 2016, 2800.00));
		employeelist.add(new Employee(114, "Rekha", 20, "Female", "HR", 2018, 2000.00));
		employeelist.add(new Employee(115, "Lija", 21, "Female", "SE", 2020, 3000.00));
		employeelist.add(new Employee(116, "Mamuni", 27, "Female", "SE", 2020, 4000.00));
		employeelist.add(new Employee(117, "Sangram", 25, "male", "HR", 2022, 4500.00));
		employeelist.add(new Employee(118, "Santosh", 25, "male", "SE", 2021, 4500.00));
		employeelist.add(new Employee(119, "Biplab", 30, "male", "SE", 2021, 3500.00));
		employeelist.add(new Employee(120, "Aditya", 45, "male", "PE", 2015, 3500.00));
		// Query 1:How many male and female employee are there in the organisation?
		method1();
		System.out.println("\n");
		// Query 2:print the name of all the department in the organisation?
		method2();
		System.out.println("\n");
		// Query 3:what is the average age of male and female employee in the
		// organisation?
		method3();
		System.out.println("\n");
		// Query 3:what is the average age of male and female employee in the
		// organisation?
		method4();
		System.out.println("\n");
		// Query 4:Get the details of highest paid employee in the organization?
		method5();
		System.out.println("\n");
		// Query 5:Get the names of all employees who have joined after 2015?
		method6();
		System.out.println("\n");
		// Query 6:Count the number of employees in each department?
		method7();
		System.out.println("\n");
		// Query 7:What is the average salary of each department?
		method8();
		System.out.println("\n");
		// Query 8: Get the details of youngest male employee in the product development
		// department?

		method9();
		System.out.println("\n");
		// Query 9:Who has the most working experience in the organization?

		method10();
		System.out.println("\n");
		// Query 10: How many male and female employees are there in the sales and
		// marketing team?

		method11();
		System.out.println("\n");
		// Query 3:What is the average salary of male and female employees?
		method12();

		// Query :12 : List down the names of all employees in each department?
		System.out.println("\n");

		method13();
		// Query : What is the average salary and total salary of the whole
		// organization?
		System.out.println("\n");//

		method14();
		// Query : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.?
		System.out.println("\n");//

		method15();
		// Query :Who is the oldest employee in the organization? What is his age and
		// which department he belongs to?
		System.out.println("\n");
	}

	public static void method1() {
		System.out.println("How many male and female employee are there in the organisation?");
		Map<String, Long> collect = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);

	}

	public static void method2() {
		System.out.println("print the name of the department in the organisation");
		employeelist.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		List<String> stream = employeelist.stream().map(x -> x.department).distinct().collect(Collectors.toList());
		System.out.println(stream);

	}

	public static void method3() {
		System.out.println("what is the average age of male and female employee in the organisation");
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);
	}

	private static void method4() {
		System.out.println("Get the details of highest paid employee in the organization?");
		Optional<Employee> highestPaidEmployeeWrapper = employeelist.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

		System.out.println("Details Of Highest Paid Employee : ");

		System.out.println("==================================");

		System.out.println("ID : " + highestPaidEmployee.getId());

		System.out.println("Name : " + highestPaidEmployee.getName());

		System.out.println("Age : " + highestPaidEmployee.getAge());

		System.out.println("Gender : " + highestPaidEmployee.getGender());

		System.out.println("Department : " + highestPaidEmployee.getDepartment());

		System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());

		System.out.println("Salary : " + highestPaidEmployee.getSalary());
	}

	private static void method5() {
		System.out.println("Get the names of all employees who have joined after 2015");
		employeelist.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

	}

	private static void method6() {
		System.out.println("Count the number of employees in each department?");
		Map<String, Long> employeeCountByDepartment = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void method7() {
		System.out.println(" What is the average salary of each department?");
		Map<String, Double> avgSalaryOfDepartments = employeelist.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void method8() {
		System.out.println(" Get the details of youngest male employee in the product development department?");
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeelist.stream()
				.filter(e -> e.getGender() == "male" && e.getDepartment() == "SE")
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		System.out.println("Details Of Youngest Male Employee In Product Development");

		System.out.println("----------------------------------------------");

		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

		System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

		System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

		System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

		System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());
	}

	private static void method9() {
		System.err.println("Who has the most working experience in the organization?");
		Optional<Employee> seniorMostEmployeeWrapper = employeelist.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

		System.out.println("Senior Most Employee Details :");

		System.out.println("----------------------------");

		System.out.println("ID : " + seniorMostEmployee.getId());

		System.out.println("Name : " + seniorMostEmployee.getName());

		System.out.println("Age : " + seniorMostEmployee.getAge());

		System.out.println("Gender : " + seniorMostEmployee.getGender());

		System.out.println("Age : " + seniorMostEmployee.getDepartment());

		System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());

		System.out.println("Salary : " + seniorMostEmployee.getSalary());
	}

	private static void method10() {
		System.out.println(" How many male and female employees are there in the sales and marketing team?");
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeelist.stream()
				.filter(e -> e.getDepartment() == "SE")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
	}

	private static void method11() {
		System.out.println("What is the average salary of male and female employees?11");
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryOfMaleAndFemaleEmployees);
	}

	private static void method12() {
		System.out.println("12 : List down the names of all employees in each department?");
		Map<String, List<Employee>> employeeListByDepartment = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
	}

	private static void method13() {
		System.out.println(" What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics employeeSalaryStatistics = employeelist.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());

		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
	}

	private static void method14() {
		System.out.println(
				" Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
		Map<Boolean, List<Employee>> partitionEmployeesByAge = employeelist.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : entrySet) {
			System.out.println("----------------------------");

			if (entry.getKey()) {
				System.out.println("Employees older than 25 years :");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("----------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}
	}

	private static void method15() {
		System.out.println(
				"Who is the oldest employee in the organization? What is his age and which department he belongs to?");
		Optional<Employee> oldestEmployeeWrapper = employeelist.stream().max(Comparator.comparingInt(Employee::getAge));

		Employee oldestEmployee = oldestEmployeeWrapper.get();

		System.out.println("Name : " + oldestEmployee.getName());

		System.out.println("Age : " + oldestEmployee.getAge());

		System.out.println("Department : " + oldestEmployee.getDepartment());
	}

}
