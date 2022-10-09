package interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private int mark;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Student(int mark) {
		super();
		this.mark = mark;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + "]";
	}

}

public class InterviewQ_8 {
	public static void main(String[] args) {

		List<Student> stuent = new ArrayList<Student>();
		Student s1 = new Student(40);
		Student s2 = new Student(45);
		Student s3 = new Student(50);
		Student s4 = new Student(55);
		Student s5 = new Student(60);
		Student s6 = new Student(65);
		Student s7 = new Student(70);

		stuent.add(s1);
		stuent.add(s2);
		stuent.add(s3);
		stuent.add(s4);
		stuent.add(s5);
		stuent.add(s6);
		stuent.add(s7);

		System.out.println("Original Salary!");
		System.out.println(stuent);

		List<Student> increamentsalary = stuent.stream().map(e -> {
			{
				e.setMark(e.getMark() +10);
			}
			return e;
		}).collect(Collectors.toList());

		System.out.println("Original Salary!");
		System.out.println(increamentsalary);

	}

}
