package by.htp.lesson05.task03.dao;

import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.dao.exception.DAOException;

public interface CommandsDAO {
	ResultDTO printAll(RequestDTO requestDTO) throws DAOException;

	ResultDTO printPopular(RequestDTO requestDTO) throws DAOException;

	ResultDTO maxPages(RequestDTO requestDTO) throws DAOException;
}
