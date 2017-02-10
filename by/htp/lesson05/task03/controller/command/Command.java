package by.htp.lesson05.task03.controller.command;

import by.htp.lesson05.task03.bean.TransferObject;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public interface Command {
	TransferObject execute(TransferObject transferObject) throws ControllerException;
}
