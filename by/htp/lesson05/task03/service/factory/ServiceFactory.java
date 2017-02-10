package by.htp.lesson05.task03.service.factory;

import by.htp.lesson05.task03.service.impl.MaxPagesService;
import by.htp.lesson05.task03.service.impl.PrintAllService;
import by.htp.lesson05.task03.service.impl.PrintPopularService;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final PrintAllService printAllService = new PrintAllService();
	private final PrintPopularService printPopularService = new PrintPopularService();
	private final MaxPagesService maxPagesService = new MaxPagesService();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public PrintAllService getPrintAllService() {
		return printAllService;
	}

	public PrintPopularService getPrintPopularService() {
		return printPopularService;
	}

	public MaxPagesService getMaxPagesService() {
		return maxPagesService;
	}

}
