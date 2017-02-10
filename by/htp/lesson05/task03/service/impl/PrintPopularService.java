package by.htp.lesson05.task03.service.impl;

import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.dao.CommandsDAO;
import by.htp.lesson05.task03.dao.factory.DAOFactory;
import by.htp.lesson05.task03.service.exception.ServiceException;

public class PrintPopularService {

	public ResultDTO printPopular(RequestDTO requestDTO) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();

		try {
			return commandsDAO.printPopular(requestDTO);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

}
