package patterns.structural.bridge;

public class Walk implements Move {

	public static final String WALK = "Walk";

	@Override
	public String move() {
		return WALK;
	}

}
