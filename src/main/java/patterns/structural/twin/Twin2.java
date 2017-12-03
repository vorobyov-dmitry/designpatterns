package patterns.structural.twin;

public class Twin2 extends Father {
private Mother mother = new Mother();
	public  String cook() {
		return mother.cook();
	} 
}
