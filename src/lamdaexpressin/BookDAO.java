package lamdaexpressin;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public List<Book> getBooks(){
	List<Book> books=new ArrayList<Book>();
	books.add(new Book(101,"core java",400));
	books.add(new Book(102,"python",500));
	books.add(new Book(103,"cpp",600));
	books.add(new Book(104,"php",700));
	return books;
	}

}
