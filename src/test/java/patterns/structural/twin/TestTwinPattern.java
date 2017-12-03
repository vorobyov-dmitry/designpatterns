package patterns.structural.twin;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.structural.proxy.Bear;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTwinPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestTwinPattern.class);
	@Test
	public void testTwinPattern() {
		LOGGER.info(" Start testTwinPattern");
		Twin1 twin1 = new Twin1();
		Twin2 twin2 = new Twin2();
		assertEquals(twin1.cook(), twin2.cook(), "The values should be equals ");
		assertEquals(twin1.drive(), twin2.drive(), "The values should be equals ");
		
	}

}
