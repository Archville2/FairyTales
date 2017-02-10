package by.htp.lesson05.task03.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import by.htp.lesson05.task03.bean.Book;
import by.htp.lesson05.task03.bean.BookComparatorByPages;
import by.htp.lesson05.task03.bean.BookComparatorByRating;
import by.htp.lesson05.task03.bean.BookComparatorByTitle;
import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.dao.CommandsDAO;
import by.htp.lesson05.task03.dao.exception.DAOException;

public class ExeCommandsDAO implements CommandsDAO {

	@Override
	public ResultDTO printAll(RequestDTO requestDTO) throws DAOException {
		Set<Book> booksSet = new TreeSet<Book>(new BookComparatorByTitle());
		String filePath = "C://temp/BooksList.txt";
		ResultDTO resultDTO=new ResultDTO();
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
			resultDTO.setBooksSet(booksSet);

		} catch (IOException e) {
			throw new DAOException("Problems with file! ");
		}

		return resultDTO;
	}

	@Override
	public ResultDTO printPopular(RequestDTO requestDTO) throws DAOException {
		Set<Book> booksSet = new TreeSet<Book>(new BookComparatorByRating());
		String filePath = "C://temp/BooksList.txt";
		ResultDTO resultDTO=new ResultDTO();
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
			resultDTO.setBooksSet(booksSet);

		} catch (IOException e) {
			throw new DAOException("Problems with file! ");
		}

		return resultDTO;
	}

	@Override
	public ResultDTO maxPages(RequestDTO requestDTO) throws DAOException {
		Set<Book> booksSet = new TreeSet<Book>(new BookComparatorByPages());
		String filePath = "C://temp/BooksList.txt";
		ResultDTO resultDTO=new ResultDTO();
		BufferedReader bufferedReader;

		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			String line;
			String[] lineElements;
			String title;
			int pagesLimit = requestDTO.getPages();
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
			resultDTO.setBooksSet(booksSet);

		} catch (IOException e) {
			throw new DAOException("Problems with file! ");
		}

		return resultDTO;
	}
}
