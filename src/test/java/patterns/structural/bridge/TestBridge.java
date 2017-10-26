package patterns.structural.bridge;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBridge {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestBridge.class);
	@Test
	public void testBridge() {
		Pedestrian pedestrian  = new Pedestrian(new Run());
		assertEquals(Run.RUN, pedestrian.go(), "The results should be the same ");
		pedestrian.setBridge(new Walk());
		assertEquals(Walk.WALK, pedestrian.go(), "The results should be the same ");
		pedestrian.setBridge(new Crawl());
		assertEquals(Crawl.CRAWL, pedestrian.go(), "The results should be the same ");
	}

}
