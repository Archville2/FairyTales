package by.htp.lesson05.task03.bean;

import java.util.Comparator;

public class BookComparatorByPages implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getPages() < o2.getPages()) {
			return 1;
		}

		if (o1.getPages() > o2.getPages()) {
			return -1;
		}

		return 0;
	}
}
