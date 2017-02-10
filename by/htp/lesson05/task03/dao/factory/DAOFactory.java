package by.htp.lesson05.task03.dao.factory;

import by.htp.lesson05.task03.dao.impl.ExeCommandsDAO;
import by.htp.lesson05.task03.dao.CommandsDAO;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final CommandsDAO commandsDAO = new ExeCommandsDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public CommandsDAO getCommandsService() {
		return commandsDAO;
	}
}
