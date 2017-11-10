package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class ContainerImpl implements Container {
	List<Container> containers = new ArrayList<>();
	List<Object> stuff = new ArrayList<>();

	@Override
	public void addContainer(Container container) {
		this.containers.add(container);
	}

	@Override
	public List<Object> listContent() {
		List<Object> data = new ArrayList<>(containers);
		data.addAll(stuff);
		for (Container container : containers) {
			data.add(container.listContent());
		}
		return data;
	}

	@Override
	public void addStuff(Object object) {
		this.stuff.add(object);
	}
}
