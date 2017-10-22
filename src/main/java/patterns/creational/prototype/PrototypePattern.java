package patterns.creational.prototype;

public abstract  class PrototypePattern {
	public abstract Prototype getPrototype() throws CloneNotSupportedException;
	public abstract Prototype getSample() ;
}
