package patterns.structural.pipeline;

public class PipeLinePatternImpl implements PipeLinePattern {
int value = 0;
	@Override
	public PipeLinePattern sum(int i) {
		value+=i;
		return this;
	}

	@Override
	public PipeLinePattern minus(int i) {
		this.value-=i;
		return this;
	}

	@Override
	public PipeLinePattern multiply(int i) {
		this.value*=i;
		return this;
	}

	@Override
	public PipeLinePattern divide(int i) {
		this.value/=i;
		return this;
	}

	@Override
	public int getI() {
		return this.value;
	}


}
