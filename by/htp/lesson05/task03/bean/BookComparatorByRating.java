package by.htp.lesson05.task03.bean;

import java.util.Comparator;

public class BookComparatorByRating implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getRating() < o2.getRating()){
			return 1;
		}
		
		if(o1.getRating() > o2.getRating()){
			return -1;
		}
		
		return 0;
	}
}
