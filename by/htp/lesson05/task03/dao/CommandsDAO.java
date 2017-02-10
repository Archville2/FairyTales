package by.htp.lesson05.task03.dao;

import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.dao.exception.DAOException;

public interface CommandsDAO {
	TransferObject printAll(TransferObject transferObject) throws DAOException;

	TransferObject printPopular(TransferObject transferObject) throws DAOException;

	TransferObject maxPages(TransferObject transferObject) throws DAOException;
}
