package patterns.structural.flyweight;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestFlyweight {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestFlyweight.class);

	// from How to Train Your Dragon
static String[] typesOfDragon = {
"Gronckle",
"Terrible Terror",
"Hideous Zippleback",
"Deadly Nadder",
"Monstrous Nightmare",
"Night Fury",
"Bewilderbeast",
"Rumblehorn",
"Stormcutter",
"Red Death"
};
@Test
public void testFlyweight() {
	Flyweight flyweight = new Flyweight();
	for (int i = 0; i < typesOfDragon.length; i++) {
		Dragon dragon = flyweight.produceDragon(typesOfDragon[i]);
		assertEquals(flyweight.getStatus(), Flyweight.OBJECT_CREATED, "The values should be equals ");
	}
	for (int i = 0; i < typesOfDragon.length; i++) {
		Dragon dragon = flyweight.produceDragon(typesOfDragon[i]);
		assertEquals(flyweight.getStatus(), Flyweight.OBJECT_RESUSED, "The values should be equals ");
	}
}

}
