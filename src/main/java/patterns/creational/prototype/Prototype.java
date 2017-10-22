package patterns.creational.prototype;

import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class Prototype implements Cloneable,Serializable {
	public static final String PROTOTYPE = "Prototype";
	private StringBuffer stringBuffer = new StringBuffer(PROTOTYPE);
	private int sum = 0;
	private StringBuilder stringBuilder = new StringBuilder(PROTOTYPE);
	public StringBuffer getStringBuffer() {
		return stringBuffer;
	}
	public void setStringBuffer(StringBuffer stringBuffer) {
		this.stringBuffer = stringBuffer;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public StringBuilder getStringBuilder() {
		return stringBuilder;
	}
	public void setStringBuilder(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}
	public Prototype  getClone() throws CloneNotSupportedException {
		return (Prototype) SerializationUtils.clone(this);
	}
	
}
