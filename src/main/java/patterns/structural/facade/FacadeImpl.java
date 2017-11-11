package patterns.structural.facade;

public class FacadeImpl implements Facade {
	private Class1 class1 = new Class1();
	private Class2 class2 = new Class2();
	private Class3 class3 = new Class3();

	@Override
	public void doCool() {
		class1.setClass2(class2);
		class3.setClass1(class1);
		doStep1();
		doStep2();
		doStep3();
	}

	private void doStep3() {
		class1.doSomething1();
		class3.doSomething3();
	}

	private void doStep2() {
		class2.doSomething2();
		class3.doSomething3();

	}

	private void doStep1() {
		class2.doSomething2();
		class2.doSomethingElse();
		class1.doSomething1();

	}

}
