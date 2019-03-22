package factory.abstractf;

import factory.CarType;
import factory.ICar;

public abstract class AbstractFactory {
    public abstract ICar getCar(CarType car);

    public void getName(String name) {
        System.out.println(name);
    }
}