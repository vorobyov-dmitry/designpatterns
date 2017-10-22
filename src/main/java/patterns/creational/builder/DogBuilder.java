package patterns.creational.builder;

public class DogBuilder implements BuilderPattern {
	Pet pet = new Dog();
	@Override
	public void setName(String name) {
		pet.setName(name);
	}

	@Override
	public void setColour(String colour) {
		pet.setColour(colour);
		
	}

	@Override
	public Pet getPet() {
		return pet;
	}

}
