package patterns.structural.bridge;

public class Pedestrian {
	private Move bridge; 
	public Pedestrian() {
	}
	public Pedestrian(Move bridge) {
		this.bridge=bridge;
	}
	public String go() {
		return bridge.move();
	}
	public Move getBridge() {
		return bridge;
	}
	public void setBridge(Move bridge) {
		this.bridge = bridge;
	}
	
}
