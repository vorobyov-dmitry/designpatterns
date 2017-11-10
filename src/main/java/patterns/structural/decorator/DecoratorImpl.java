package patterns.structural.decorator;

public class DecoratorImpl extends AbstractDecorator {

	public  static final String TAKE_BAG = "Take  bag. ";
	public  static final String RETURN_BAG = " Return bag.";

	@Override
	public String carry() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(TAKE_BAG);
		stringBuilder.append(super.carry());
		stringBuilder.append(RETURN_BAG);
		return stringBuilder.toString();
	}

}
