package patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class1 {
	private static final Logger LOGGER = LoggerFactory.getLogger(Class3.class);
	private Class2 class2 = null;
	public void doSomething1() {
		LOGGER.info("doSomething1()");
		if (class2!=null) {
			class2.doSomethingElse();
		}
	}
	public Class2 getClass2() {
		return class2;
	}
	public void setClass2(Class2 class2) {
		this.class2 = class2;
	}

}
