package patterns.structural.composite;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComposite {
	private static final Logger LOGGER = LoggerFactory.getLogger(	TestComposite.class);
	@Test
	public void testComposite() {
		LOGGER.info("testComposite(");
		Container rootContainer = new Box();
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		Box box4 = new Box();
	}
}
