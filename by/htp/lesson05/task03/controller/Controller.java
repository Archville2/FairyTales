package by.htp.lesson05.task03.controller;

import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.controller.command.Command;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public class Controller {
	private final CommandProvider provider = new CommandProvider();
	TransferObject transferObject = new TransferObject();

	public TransferObject executeTask(String message) throws ControllerException {
		String[] commands = message.split(" ");
		String operation = commands[0];
		transferObject.setText(message);
		
		Command executionCommand = provider.getCommand(operation);

		return executionCommand.execute(transferObject);

	}

}
