package by.htp.lesson05.task03.service.impl;

import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.dao.CommandsDAO;
import by.htp.lesson05.task03.dao.factory.DAOFactory;
import by.htp.lesson05.task03.service.exception.ServiceException;

public class PrintPopularService {

	public TransferObject printPopular(TransferObject transferObject) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();

		try {
			return commandsDAO.printPopular(transferObject);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

}
