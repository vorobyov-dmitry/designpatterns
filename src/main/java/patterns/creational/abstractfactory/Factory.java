package patterns.creational.abstractfactory;

public class Factory  {
	private  Land context;

	public Land getContext() {
		return context;
	}

	public void setContext(Land context) {
		this.context = context;
	}
	public AbstractFactoryPattern getAbstractFactoryPattern() {
		if (context==null) {
			throw new UnsupportedOperationException(" The context is null , magic creature can not be created ");
		}
		switch (context) {
		case EARTH:
			return new HumanFactory();
		case ORCS_LAND:
			return new OrcFactory();
		case ELF_LAND:
			return new ElfFactory();
		default:
			throw new UnsupportedOperationException(" The context is uknown "+context+"  , magic creature can not be created ");
		}
	} 
}
