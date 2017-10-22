package patterns.creational.abstractfactory;

public class OrcFactory implements AbstractFactoryPattern {

	@Override
	public MagicCreature createCreature() {
		return new Orc();
	}

}
