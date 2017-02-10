package by.htp.lesson05.task03.bean;

import java.io.Serializable;
import java.util.TreeSet;

public class TransferObject implements Serializable {
	private static final long serialVersionUID = 1L;
	private TreeSet<Book> booksSet = new TreeSet<Book>();
	private String text;
	private int pages;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public TreeSet<Book> getBooksSet() {
		return booksSet;
	}

	public void setBooksSet(TreeSet<Book> booksSet) {
		this.booksSet = booksSet;
	}
	
}
