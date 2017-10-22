package patterns.creational.builder;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestBuilderPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestBuilderPattern.class);
	@Test
	public void testCatBuilder() {
		BuilderPattern builderPattern = new CatBuilder();
		builderPattern.setName("cat");
		builderPattern.setColour("black");
		Pet pet = builderPattern.getPet();
		assertEquals("Mur", pet.getType());
	}
	@Test
	public void testDogBuilder() {
		BuilderPattern builderPattern = new DogBuilder();
		builderPattern.setName("dog");
		builderPattern.setColour("white");
		Pet pet = builderPattern.getPet();
		assertEquals("RRRRR", pet.getType());
	}

}
