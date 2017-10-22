package patterns.creational.abstractfactory;

public class ElfFactory implements AbstractFactoryPattern {

	@Override
	public MagicCreature createCreature() {
		return new Elf();
	}

}
