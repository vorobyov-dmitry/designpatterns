package patterns.structural.flyweight;

public class Dragon {
private String type = null;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Dragon(String type) {
	super();
	this.type = type;
}

}
