package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stream API - collection process
		// collection- gruop of object

		// 1- black
		Stream<Object> empty = Stream.empty();
		empty.forEach(e -> {
			System.out.println(e);

		});
		//2- array,object,collection
		String name[] = { "Satya", "Prakash", "Ankit", "Santi" };
		Stream<String> stream1 = Stream.of(name);
		stream1.forEach(e ->{
			System.out.println(e);
		});
           //3-builder pattern
		Stream<Object> build = Stream.builder().build();
		//4 int stream
		IntStream stream =  Arrays.stream(new int[]{2,23,4,34,756});
		stream.forEach(e->{
			System.out.println(e);
		});
		//5.List,set
		List<Integer> list2=new ArrayList<Integer>();//mutalbe list
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(16);
		
		Stream<Integer>  stream2=list2.stream();
		stream2.forEach(e->{
			System.out.println(e);
		});
		
	}

}
