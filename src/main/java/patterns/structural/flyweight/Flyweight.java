package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
	public static char INIT_STATE = 'i';
	public static char OBJECT_CREATED = 'c';
	public static char OBJECT_RESUSED = 'r';

	private char status = INIT_STATE;
	private Map<String, Dragon> dragons = new HashMap<String, Dragon>();

	public Dragon produceDragon(String type) {
		Dragon dragon = dragons.get(type);
		if (dragon == null) {
			dragon = new Dragon(type);
			this.dragons.put(type, dragon);
			status = OBJECT_CREATED;
		}
		else {
			status = OBJECT_RESUSED;
		}
		return dragon;
	}

	public char getStatus() {
		return status;
	}

}
