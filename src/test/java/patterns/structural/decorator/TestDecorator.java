package patterns.structural.decorator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDecorator {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestDecorator.class);
	@Test
	public void testManCarrier() {
		LOGGER.info("Start testManCarrier()");
		Carrier carrier = new ManCarrier();
		assertEquals(carrier.carry(), Carrier.CARRY_STUFF,"Should be equals");
		LOGGER.info("TestManCarrier() passed");
	}
	@Test
	public void testDecoratorCarrier() {
		LOGGER.info("Start testDecoratorCarrier()");
		Carrier carrier = new ManCarrier();
		AbstractDecorator decoratedCarrier = new DecoratorImpl();
		decoratedCarrier.setDecoratedCarrier(carrier);
		assertEquals(decoratedCarrier.carry(), DecoratorImpl.TAKE_BAG+ Carrier.CARRY_STUFF+DecoratorImpl.RETURN_BAG,"Should be equals");
		LOGGER.info("testDecoratorCarrier() passed");
	}

}
