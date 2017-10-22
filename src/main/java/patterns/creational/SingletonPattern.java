package patterns.creational;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonPattern {
	private static final Logger LOGGER = LoggerFactory.getLogger(SingletonPattern.class); 
	private final String singletonText = "singleToneText_" + ((int) (Math.random() * 100));
	private static  SingletonPattern singletonPattern;  

	private SingletonPattern() {
		LOGGER.info(" SingletonPattern has been created singletonText = {}",singletonText);
	}
	public String getSingletonText() {
		return singletonText;
	}
	public static SingletonPattern getInstance() {
		if (singletonPattern==null) {
			singletonPattern = new SingletonPattern();
		}
		return singletonPattern;
	}
	public static void main(String[] args) {
		SingletonPattern  singletonPattern1 = getInstance();
		LOGGER.info(" new instance 1 with singletonText{}",singletonPattern1.getSingletonText());
		SingletonPattern  singletonPattern2 = getInstance();
		LOGGER.info(" new instance 2 with singletonText{}",singletonPattern2.getSingletonText());
		SingletonPattern  singletonPattern3 = getInstance();
		LOGGER.info(" new instance 3 with singletonText{}",singletonPattern3.getSingletonText());
		assert(singletonPattern1.getSingletonText()==singletonPattern2.getSingletonText());
		assert(singletonPattern3.getSingletonText()==singletonPattern2.getSingletonText());
	}
}
