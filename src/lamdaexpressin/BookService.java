package lamdaexpressin;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.main;

public class BookService {
	public List<Book> getBookinSotrt(){
		List<Book> books=new BookDAO().getBooks();
		Collections.sort(books,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		System.out.print(new BookService().getBookinSotrt());
	}
}
	
/*class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getName().compareTo(o1.getName());
	}*/
	


