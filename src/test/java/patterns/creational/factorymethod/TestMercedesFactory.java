package patterns.creational.factorymethod;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMercedesFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestMercedesFactory.class);
	@Test
	public void testMercedesFactory() {
		LOGGER.info(" Start testMercedesFactory()");
		FactoryMethodPattern  factoryMethodPattern = new MercedesFactory();
		assertEquals("Mercedes",  factoryMethodPattern.makeCar().getCarName(),"The Mercedes expected ");
		LOGGER.info(" testMercedesFactory() passed");
	}
}
