package by.htp.lesson05.task03.controller;

import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.controller.command.Command;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public class Controller {
	private final CommandProvider provider = new CommandProvider();
	RequestDTO requestDTO = new RequestDTO();

	public ResultDTO executeTask(String message) throws ControllerException {
		String[] commands = message.split(" ");
		String operation = commands[0];
		requestDTO.setText(message);
		
		Command executionCommand = provider.getCommand(operation);

		return executionCommand.execute(requestDTO);

	}

}
