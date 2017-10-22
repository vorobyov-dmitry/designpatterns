package patterns.creational.builder;

public class CatBuilder implements BuilderPattern{
	Pet pet = new Cat();
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
