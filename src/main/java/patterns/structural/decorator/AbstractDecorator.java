package patterns.structural.decorator;

public abstract class AbstractDecorator implements Carrier {
	private Carrier decoratedCarrier = null;

	public AbstractDecorator() {
	}
	public AbstractDecorator(Carrier decoratedCarrier) {
		this.decoratedCarrier = decoratedCarrier;
	}

	public Carrier getDecoratedCarrier() {
		return decoratedCarrier;
	}

	public void setDecoratedCarrier(Carrier decoratedCarrier) {
		this.decoratedCarrier = decoratedCarrier;
	}

	@Override
	public String carry() {
		return this.decoratedCarrier.carry();
	}

}
