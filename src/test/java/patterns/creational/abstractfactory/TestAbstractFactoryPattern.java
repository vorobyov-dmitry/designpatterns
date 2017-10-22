package patterns.creational.abstractfactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAbstractFactoryPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestAbstractFactoryPattern.class);
	private Factory factory = new Factory();

	@Test
	public void testOrcFactory() {
		LOGGER.info("Start testOrcFactory");
		AbstractFactoryPattern abstractFactoryPattern = getAbstractFactoryPattern(Land.ORCS_LAND);
		assertEquals(abstractFactoryPattern.createCreature().getType(), MagicCreature.orc, "Expect orc ");
		LOGGER.info("testOrcFactory  passed");
	}

	@Test
	public void testElfFactory() {
		LOGGER.info("Start testElfFactory");
		AbstractFactoryPattern abstractFactoryPattern = getAbstractFactoryPattern(Land.ELF_LAND);
		assertEquals(abstractFactoryPattern.createCreature().getType(), MagicCreature.elf, "Expect elf ");
		LOGGER.info("testElfFactory  passed");
	}

	@Test
	public void testHumanFactory() {
		LOGGER.info("Start testHumanFactory()");
		AbstractFactoryPattern abstractFactoryPattern = getAbstractFactoryPattern(Land.EARTH);
		assertEquals(abstractFactoryPattern.createCreature().getType(), MagicCreature.human, "Expect human");
		LOGGER.info("testHumanFactory()  passed");
	}

	private AbstractFactoryPattern getAbstractFactoryPattern(Land land) {
		LOGGER.debug(" Set context to {}", land);
		factory.setContext(land);
		return factory.getAbstractFactoryPattern();
	}
}
