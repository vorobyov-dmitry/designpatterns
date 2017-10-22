package patterns.creational.factorymethod;

public class BMWFactory implements FactoryMethodPattern {

	@Override
	public Car makeCar() {
		return new BMW();
	}

}
