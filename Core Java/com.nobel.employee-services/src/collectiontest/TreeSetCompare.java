package collectiontest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetCompare{
	public static void main(String[] args) {
//		Set<Book> oldBooks = new TreeSet<>();
//				oldBooks.add(new Book(1, "Godfather", "mClerren"));
//				
				Set<Book> books = new TreeSet<>();
				books.add(new Book(10, "SCJP", "Kathy"));
				books.add(new Book(13, "Core Java", "Kathy"));
				books.add(new Book(9, "Adv Java", "Herbert"));

				for (Book book : books)
					System.out.println(book);
				
				
				List<String> names = Arrays.asList("sunil", "ganesh", "satish", "akash", "anil", "ganesh");
				System.out.println(names);

				Collections.shuffle(names);
				System.out.println(names);

				Collections.reverse(names);
				System.out.println(names);
//
//				int index = Collections.binarySearch(names, "akash");
//				System.out.println(index);
//
//				int count = Collections.frequency(books, "Kathy");
//				System.out.println(count);

				
				Set<String> namess = new TreeSet<>();
			namess.add("anil"); 
				namess.add("anil");
				namess.add("ganesh");
				
				System.out.println(namess);
				
				
			}
	}

