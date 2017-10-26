package patterns.structural.adapter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdapterPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestAdapterPattern.class);

	@Test
	public void testAdapterPattern() {
		LOGGER.info("testAdapterPattern()");
		String expected = new InterfaceOldImplementation().getTextValue();
		String actual = new AdapterPattern().getStringValue();
		assertEquals(expected, actual, "The string value should be identical");
	}
}
