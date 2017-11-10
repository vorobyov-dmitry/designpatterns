package patterns.structural.composite;

import java.util.List;

public interface Container {
	void addContainer(Container container );
	List<Object> listContent();
	void addStuff(Object object);
	String getName();
}
