package patterns.creational.factorymethod;


public class MercedesFactory implements FactoryMethodPattern{

	@Override
	public Car makeCar() {
		return new Mercedes();
	}


}
