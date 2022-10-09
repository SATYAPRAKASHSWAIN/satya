package interviewquestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Patients {
	private String name;
	private int age;
	private String disease;
	private int amount;

	public Patients(String name, int age, String disease, int amount) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.amount = amount;
	}

	public Patients() {
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

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Patients [name=" + name + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
	}

}

public class CoronaPatients {
	public static void main(String[] args) {

		Patients p1 = new Patients("p1", 20, "Corona", 18000);
		Patients p2 = new Patients("p2", 26, "Corona", 6000);
		Patients p3 = new Patients("p3", 29, "Diabeties", 8000);
		Patients p4 = new Patients("p4", 20, "Corona", 12000);

		List<Patients> patients = Arrays.asList(p1, p2, p3, p4);
		// printing the corona patiets and whose age is greater than 25
		patients.stream().filter(p -> p.getDisease() == "Corona" && p.getAge() < 25).forEach(System.out::println);

		// average bill paid of the corona patients
		Double averageBillpaid = patients.stream().filter(p -> p.getDisease().equals("Corona"))
				.collect(Collectors.averagingDouble(Patients::getAmount));
		System.out.println("Average bill paid :"+averageBillpaid);
	}

}
