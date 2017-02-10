package by.htp.lesson05.task03.service.impl;

import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.dao.CommandsDAO;
import by.htp.lesson05.task03.dao.factory.DAOFactory;
import by.htp.lesson05.task03.service.exception.ServiceException;

public class MaxPagesService {

	public ResultDTO maxPages(RequestDTO requestDTO) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		CommandsDAO commandsDAO = daoObjectFactory.getCommandsService();

		try {
			String[] text = requestDTO.getText().split(" ");
			requestDTO.setPages(Integer.parseInt(text[1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ServiceException("Missing pages number! ");
		} catch (NumberFormatException e) {
			throw new ServiceException("Wrong page number! ");
		}

		try {
			return commandsDAO.maxPages(requestDTO);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
}
