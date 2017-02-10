package by.htp.lesson05.task03.bean;

public class Book implements Comparable<Book> {
	private String title;
	private int pages;
	private float rating;

	public Book(String title, int pages, float rating) {
		super();
		this.title = title;
		this.pages = pages;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Book book) {
		if (this.title.compareTo(book.title) > 0) {
			return 1;
		}
		if (this.title.compareTo(book.title) < 0) {
			return -1;
		}

		return 0;
	}

	@Override
	public String toString() {
		return title + "\t" + pages + "\t" + rating;
	}

}
