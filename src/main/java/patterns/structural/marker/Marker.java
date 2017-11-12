package patterns.structural.marker;

public class Marker {
private int i = 0;

public int getI() {
	return i;
}

//it is marker
@Deprecated
public void setI(int i) {
	this.i = i;
}

}
