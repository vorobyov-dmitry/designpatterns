package patterns.creational.abstractfactory;

public class HumanFactory implements AbstractFactoryPattern {

	@Override
	public MagicCreature createCreature() {
		return new Human();
	}

}
