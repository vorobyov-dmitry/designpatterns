package patterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBMWFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestBMWFactory.class);
	@Test
	public void testBMWFactory() {
		LOGGER.info(" Start testBMWFactory()");
		FactoryMethodPattern  factoryMethodPattern = new BMWFactory();
		assertEquals("BMW",  factoryMethodPattern.makeCar().getCarName(),"The BMW expected ");
		LOGGER.info(" testBMWFactory() passed");
	}

}
