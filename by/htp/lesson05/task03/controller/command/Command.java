package by.htp.lesson05.task03.controller.command;

import by.htp.lesson05.task03.bean.RequestDTO;
import by.htp.lesson05.task03.bean.ResultDTO;
import by.htp.lesson05.task03.controller.exception.ControllerException;

public interface Command {
	ResultDTO execute(RequestDTO requestDTO) throws ControllerException;
}
