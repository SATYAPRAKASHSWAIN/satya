package interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collection.list.Arraylist;

class Employe{
	private String name;
	private int age;
	private String gender;
	private String department;
	public Employe(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department + "]";
	}
	
	
}
public class EmployeeProgram {
	public static void main(String[] args) {
		
	List<Employe> employe=  new ArrayList<Employe>();	
	employe.add(new Employe("ABC",30,"Female","HR"));
	employe.add(new Employe("PQR",25,"male","IT"));
	employe.add(new Employe("LMN",30,"male","HR"));
	employe.add(new Employe("XYZ",28,"Female","IT"));
	//printing all the department only once
	employe.stream().map(Employe::getDepartment).distinct().forEach(System.out::println);
	
	//printing the occurance of each deparatment
	Map<String, Long> collect = employe.stream().collect(Collectors.groupingBy(Employe::getDepartment,Collectors.counting()));
	System.out.println(collect);
	 //printing the average age of male and female employee
	Map<String, Double> avg = employe.stream().collect(Collectors.groupingBy(Employe::getGender,Collectors.averagingDouble(Employe::getAge)));
	System.out.println(avg);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
