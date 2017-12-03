package patterns.structural.twin;

public class Twin1 extends Mother {
	private Father father = new Father();
	public String drive() {
		return father.drive();
	} 
}
