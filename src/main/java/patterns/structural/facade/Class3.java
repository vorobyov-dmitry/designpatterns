package patterns.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class3 {
	private static final Logger LOGGER = LoggerFactory.getLogger(Class3.class);
	private Class1 class1 ;

	public void doSomething3() {
		LOGGER.info("doSomething3()");
		if (class1!=null) {
			class1.doSomething1();
		}
	}

	public Class1 getClass1() {
		return class1;
	}

	public void setClass1(Class1 class1) {
		this.class1 = class1;
	}
}
