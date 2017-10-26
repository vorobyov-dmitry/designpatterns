package patterns.structural.adapter;

public class AdapterPattern implements InterfaceNew{
	private InterfaceOld interfaceOld=new InterfaceOldImplementation(); 
	@Override
	public String getStringValue() {
		return this.interfaceOld.getTextValue();
	}
}
