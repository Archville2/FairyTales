package by.htp.lesson05.task03.controller.command.impl;

import by.htp.lesson05.task03.service.exception.ServiceException;
import by.htp.lesson05.task03.service.factory.ServiceFactory;
import by.htp.lesson05.task03.service.impl.PrintPopularService;
import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.controller.command.Command;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public class PrintPopular implements Command {

	@Override
	public TransferObject execute(TransferObject transferObject) throws ControllerException {

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		PrintPopularService printPopularService = serviceFactory.getPrintPopularService();

		try {
			return printPopularService.printPopular(transferObject);
		} catch (ServiceException e) {
			throw new ControllerException(e);

		}
	}
}
