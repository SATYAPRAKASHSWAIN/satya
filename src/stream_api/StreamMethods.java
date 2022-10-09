package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//filter(dPredidcate)
		
		               //boolean values function
		               //e->e>10
		
		
		//map(Fuction)
		/*
		each element operation 
		
		 */
		List<String> list = List.of("Satya","Prakash ","swain ","the naem of quality");
		List<String> collect = list.stream().filter(e->e.startsWith("P")).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<Integer> of = List.of(4,5,6,7,8,9,23);
		List<Integer> collect2 = of.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect2);
		
		list.stream().forEach(
				e->{
					System.out.println(e);
				}
				);
		collect.stream().forEach(System.out::println);
		
		//sorted
		
		of.stream().sorted().forEach(System.out::println);
		
		Integer integer = of.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("min value is "+integer);
		
		Integer integer2 = of.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(integer2);

	}

}
