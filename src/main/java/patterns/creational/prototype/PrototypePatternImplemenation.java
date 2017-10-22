package patterns.creational.prototype;

public class PrototypePatternImplemenation extends  PrototypePattern{
	Prototype sample = new Prototype(); 
	public Prototype getPrototype() throws CloneNotSupportedException{
		return sample.getClone();
	}
	public Prototype getSample() {
		return sample;
	}

}
