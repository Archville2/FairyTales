package by.htp.lesson05.task03.view;

import java.util.Scanner;
import java.util.Set;

import by.htp.lesson05.task03.controller.Controller;
import by.htp.lesson05.task03.controller.exception.ControllerException;
import by.htp.lesson05.task03.bean.Book;
import by.htp.lesson05.task03.bean.ResultDTO;

public class MainClass {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		ResultDTO resultDTO = null;
		Set<Book> bookSet;
		String task;

		System.out.println("Доступные команды: PRINT_ALL, PRINT_POPULAR, MAX_PAGES <number>");

		while (true) {
			task = scanner.nextLine();
			try {
				resultDTO = controller.executeTask(task);
				bookSet = resultDTO.getBooksSet();

				System.out.printf("%-66s %s %10s\n", "Название книги:", "Страницы:", "Рейтинг:");

				for (Book book : bookSet) {
					// System.out.println(book);
					System.out.printf("%-70s %d %10.1f\n", book.getTitle(), book.getPages(), book.getRating());
				}
			} catch (ControllerException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
