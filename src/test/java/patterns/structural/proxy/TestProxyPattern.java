package patterns.structural.proxy;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProxyPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestProxyPattern .class);
	@Test
	public void testProxyPattern() {
		LOGGER.info(" Start testProxyPattern");
		Bear bear = new BearImpl();
		assertEquals(Bear.ROAR, bear.roar(), "The values should be equals ");
		bear = new ProxyPattern().getBearProxy();
		assertEquals(ProxyPattern.ROAR, bear.roar(), "The values should be equals ");
	}

}
