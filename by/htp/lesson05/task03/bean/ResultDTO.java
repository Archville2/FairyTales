package by.htp.lesson05.task03.bean;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Set<Book> booksSet = new TreeSet<Book>();

	public Set<Book> getBooksSet() {
		return booksSet;
	}

	public void setBooksSet(Set<Book> booksSet) {
		this.booksSet = booksSet;
	}

}
