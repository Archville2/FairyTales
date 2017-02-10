package by.htp.lesson05.task03.bean;

import java.io.Serializable;

public class RequestDTO implements Serializable {
	private static final long serialVersionUID = 1L;
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
}
