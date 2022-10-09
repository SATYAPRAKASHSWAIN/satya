package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create list and filter all the even number from the list  
		List<Integer> list1=List.of(2, 3, 4, 5, 6, 7, 8, 9);//immutable list
		
		List<Integer> list2=new ArrayList<Integer>();//mutalbe list
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(16);
		System.out.println(list1);
		//System.out.println(list2);
		List<Integer> list3 = Arrays.asList(23,2323,32,53,2323,22);
		//without stream
		List<Integer> listEven= new ArrayList<Integer>();
		
		for(Integer i:list1) {
			if(i%2==0) {
				listEven.add(i);
			}
			
		}
		//System.out.println(listEven);
		
		//with stream
//		Stream<Integer> stream = list1.stream();
//		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(collect);
		
		
		List<Integer> collect = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = list1.stream().filter(i->i>5).collect(Collectors.toList());
		System.out.println(collect2);
		
	}

}
