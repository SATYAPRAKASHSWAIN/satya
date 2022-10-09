package interviewquestion;

import java.util.ArrayList;

import com.collection.list.Arraylist;
//itrating the arrraylist using foreach and lamda expression
public class InterviewQ_6 {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("satya");
		arr.add("prakash");
		arr.add("swain");
		arr.add("chiku");
		arr.add("aditya");
		arr.add("smruti");
		arr.add("pranab");
		arr.add("bikram");
		arr.add("bhabani");
		
		System.out.println("After iterate the arraylist :");
		arr.stream().forEach((e)->{
			System.out.print(e+",");
		});
	
	}

}
