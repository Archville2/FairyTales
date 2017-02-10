package by.htp.lesson05.task03.controller;

import java.util.Map;
import java.util.HashMap;

import by.htp.lesson05.task03.controller.command.Command;
import by.htp.lesson05.task03.controller.command.CommandName;
import by.htp.lesson05.task03.controller.command.impl.PrintAll;
import by.htp.lesson05.task03.controller.command.impl.PrintPopular;
import by.htp.lesson05.task03.controller.exception.ControllerException;
import by.htp.lesson05.task03.controller.command.impl.MaxPages;

final class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put(CommandName.PRINT_ALL, new PrintAll());
		repository.put(CommandName.PRINT_POPULAR, new PrintPopular());
		repository.put(CommandName.MAX_PAGES, new MaxPages());
	}

	Command getCommand(String name) throws ControllerException {
		CommandName commandName;
		Command command;

		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			throw new ControllerException("Wrong command! ");
		}
		return command;
	}
}