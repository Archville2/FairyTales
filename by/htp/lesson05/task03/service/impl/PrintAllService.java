package by.htp.lesson05.task03.service.impl;

import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.dao.CommandsDAO;
import by.htp.lesson05.task03.dao.factory.DAOFactory;
import by.htp.lesson05.task03.service.exception.ServiceException;

public class PrintAllService {

	public TransferObject printAll(TransferObject transferObject) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();

		try {
			return commandsDAO.printAll(transferObject);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
}
