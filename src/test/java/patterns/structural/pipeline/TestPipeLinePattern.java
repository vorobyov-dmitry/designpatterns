package patterns.structural.pipeline;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPipeLinePattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestPipeLinePattern.class);
	@Test
	public void testPipeLinePattern () {
		LOGGER.info(" Start testPipeLinePattern ()");
		PipeLinePattern pipeLinePattern = new PipeLinePatternImpl();
		assertEquals(3,pipeLinePattern.sum(2).multiply(2).multiply(2).minus(2).divide(2).getI(),"The values should be equals ");
	}

}
