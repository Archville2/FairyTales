package by.htp.lesson05.task03.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

import by.htp.lesson05.task03.bean.Book;
import by.htp.lesson05.task03.bean.BookComparatorByPages;
import by.htp.lesson05.task03.bean.BookComparatorByRating;
import by.htp.lesson05.task03.bean.BookComparatorByTitle;
import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.dao.CommandsDAO;
import by.htp.lesson05.task03.dao.exception.DAOException;

public class ExeCommandsDAO implements CommandsDAO {

	@Override
	public TransferObject printAll(TransferObject transferObject) throws DAOException {
		TreeSet<Book> booksSet = new TreeSet<Book>(new BookComparatorByTitle());
		String filePath = "C://temp/BooksList.txt";
		BufferedReader bufferedReader;

		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			String line;
			String[] lineElements;
			String title;
			int pages;
			float rating;

			while ((line = bufferedReader.readLine()) != null) {
				lineElements = line.split("\t");
				title = lineElements[0];
				pages = Integer.parseInt(lineElements[1]);
				rating = Float.parseFloat(lineElements[2]);
				booksSet.add(new Book(title, pages, rating));
			}
			transferObject.setBooksSet(booksSet);

		} catch (IOException e) {
			throw new DAOException("Problems with file! ");
		}

		return transferObject;
	}

	@Override
	public TransferObject printPopular(TransferObject transferObject) throws DAOException {
		TreeSet<Book> booksSet = new TreeSet<Book>(new BookComparatorByRating());
		String filePath = "C://temp/BooksList.txt";
		BufferedReader bufferedReader;

		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			String line;
			String[] lineElements;
			String title;
			int pages;
			float rating;

			while ((line = bufferedReader.readLine()) != null) {
				lineElements = line.split("\t");
				title = lineElements[0];
				pages = Integer.parseInt(lineElements[1]);
				rating = Float.parseFloat(lineElements[2]);

				booksSet.add(new Book(title, pages, rating));
			}
			transferObject.setBooksSet(booksSet);

		} catch (IOException e) {
			throw new DAOException("Problems with file! ");
		}

		return transferObject;
	}

	@Override
	public TransferObject maxPages(TransferObject transferObject) throws DAOException {
		TreeSet<Book> booksSet = new TreeSet<Book>(new BookComparatorByPages());
		String filePath = "C://temp/BooksList.txt";
		BufferedReader bufferedReader;

		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			String line;
			String[] lineElements;
			String title;
			int pagesLimit = transferObject.getPages();
			int pages;
			float rating;

			while ((line = bufferedReader.readLine()) != null) {
				lineElements = line.split("\t");
				title = lineElements[0];
				pages = Integer.parseInt(lineElements[1]);
				rating = Float.parseFloat(lineElements[2]);

				if (pages < pagesLimit) {
					booksSet.add(new Book(title, pages, rating));
				}
			}
			transferObject.setBooksSet(booksSet);

		} catch (IOException e) {
			throw new DAOException("Problems with file! ");
		}

		return transferObject;
	}
}
