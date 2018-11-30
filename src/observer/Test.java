package observer;

public class Test {
	public static void main(String [] args){
		ConcreteSubject eatSubject = new ConcreteSubject();
		
		ConcreteObserver personOne = new ConcreteObserver("DB_boy");
		ConcreteObserver personTwo = new ConcreteObserver("Gin");
		
		eatSubject.addObserver(personOne);
		eatSubject.addObserver(personTwo);

		eatSubject.notifyObserver("喝了一杯啤酒。");
		eatSubject.removeObserver(personTwo);
		eatSubject.notifyObserver("又喝了一杯二锅头。");

	}

}
