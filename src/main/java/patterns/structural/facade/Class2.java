package patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class2 {
	private static final Logger LOGGER = LoggerFactory.getLogger(Class2.class);

	public void doSomething2() {
		LOGGER.info("doSomething2()");

	}
	public void doSomethingElse() {
		LOGGER.info("doSomethingElse()");

	}

}
