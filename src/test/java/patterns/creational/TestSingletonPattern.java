package patterns.creational;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSingletonPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestSingletonPattern.class);
	private static final int TEST_INSTANCES = 10;

	@Test
	public void testSingletonPattern() {
		LOGGER.info(" Start testSingletonPattern() with {} instances ", TEST_INSTANCES);
		SingletonPattern singletonPattern = SingletonPattern.getInstance();
		assertNotNull(singletonPattern);
		for (int i = 0; i < TEST_INSTANCES; i++) {
			SingletonPattern anotherSingletonPattern = SingletonPattern.getInstance();
			assertTrue(singletonPattern == anotherSingletonPattern, " It should be the same instance");
		}
		LOGGER.info(" testSingletonPattern() passed");

	}
}
