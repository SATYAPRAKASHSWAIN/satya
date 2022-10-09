package java_8_feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
//filter--------------->for_conditional statement

public class For_each {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Satya");
		list.add("Prakash");
		list.add("Swain");
		list.add("Pranab");
		list.add("chhita");
		list.add("bikram");
		for (String string : list) {
			if (string.startsWith("S")) {
				// System.out.println(string);
			}
		}
		// list.stream().filter(t->t.startsWith("S")).forEach(t->System.out.println(t));
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

		// map.forEach((key,values)->System.out.println(key+" "+values));
		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

		/*
		 * //for_each loop for iterating the data
		 * 
		 * 
		 * 
		 * 
		 * for (String string : list) { System.out.println(string); } //for lambda
		 * expression list.stream().forEach(t->System.out.println(t));
		 * 
		 * Map<Integer,String> map=new HashMap<Integer,String>(); map.put(1,"a");
		 * map.put(2,"b"); map.put(3,"c"); map.put(4,"d"); map.put(5,"e");
		 * 
		 * map.forEach((key,values)->System.out.println(key+" "+values));
		 * map.entrySet().forEach(obj->System.out.println(obj));
		 * 
		 * Consumer<String> consumer=(t)-> System.out.println(t);
		 * consumer.accept("satyaprakash"); for (String string : list) {
		 * consumer.accept(string);
		 * 
		 * }
		 */
	}

}
