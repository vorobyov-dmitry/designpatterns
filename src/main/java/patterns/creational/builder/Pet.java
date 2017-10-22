package patterns.creational.builder;

public abstract class Pet {
	private String name;
	private String colour;
	public abstract String getType();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
