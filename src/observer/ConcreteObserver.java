package observer;

public class ConcreteObserver implements Observer {
private String name ;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String str) {
		System.out.println(this.name +": "+str);

	}

}
