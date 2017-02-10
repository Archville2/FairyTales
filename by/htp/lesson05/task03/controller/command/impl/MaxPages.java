package by.htp.lesson05.task03.controller.command.impl;

import by.htp.lesson05.task03.service.exception.ServiceException;
import by.htp.lesson05.task03.service.factory.ServiceFactory;
import by.htp.lesson05.task03.service.impl.MaxPagesService;
import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.controller.command.Command;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public class MaxPages implements Command {

	@Override
	public TransferObject execute(TransferObject transferObject) throws ControllerException {

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		MaxPagesService maxPagesService = serviceFactory.getMaxPagesService();
		try {
			return maxPagesService.maxPages(transferObject);
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}
	}
}
