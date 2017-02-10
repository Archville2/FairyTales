package by.htp.lesson05.task03.controller.command.impl;

import by.htp.lesson05.task03.service.exception.ServiceException;
import by.htp.lesson05.task03.service.factory.ServiceFactory;
import by.htp.lesson05.task03.service.impl.MaxPagesService;
import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.controller.command.Command;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public class MaxPages implements Command {

	@Override
	public ResultDTO execute(RequestDTO requestDTO) throws ControllerException {

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		MaxPagesService maxPagesService = serviceFactory.getMaxPagesService();
		try {
			return maxPagesService.maxPages(requestDTO);
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}
	}
}
