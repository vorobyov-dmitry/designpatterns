package patterns.creational.prototype;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestPrototypePattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestPrototypePattern.class);
	private PrototypePattern prototypePattern = new PrototypePatternImplemenation();  
	@Test
	public void testPrototypePattern()  {
		Prototype sample = this.prototypePattern.getSample();
		try {
			Prototype prototype = this.prototypePattern.getPrototype();
			prototype.setSum(prototype.getSum()+100);
			prototype.setStringBuffer(prototype.getStringBuffer().append("test"));
			prototype.setStringBuilder(prototype.getStringBuilder().append("test01"));
			assertNotEquals(prototype, sample,"The prototype and sample should be not the same object");
			assertNotEquals(prototype.getStringBuffer(), sample.getStringBuffer(),"The field StringBuffer of prototype and sample should be not the same object");
			assertNotEquals(prototype.getStringBuilder(), sample.getStringBuilder(),"The field StringBuilder of prototype and sample should be not the same object");
			assertTrue(prototype.getSum()!=sample.getSum(),"The field sum of prototype and sample should be not the same object");
			
		} catch (CloneNotSupportedException e) {
			LOGGER.error(" Exception during test ",e);
			fail(e.getMessage());
		
		}
		
	}

}
