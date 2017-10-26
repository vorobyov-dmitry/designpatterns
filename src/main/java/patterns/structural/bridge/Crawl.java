package patterns.structural.bridge;

public class Crawl implements Move {

	public static final String CRAWL = "Crawl";

	@Override
	public String move() {
		return CRAWL;
	}

}
