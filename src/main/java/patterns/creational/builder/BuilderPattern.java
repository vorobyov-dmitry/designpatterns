package patterns.creational.builder;

public interface BuilderPattern {
	public void setName(String name);
	public void setColour(String colour);
	public Pet getPet();
}
