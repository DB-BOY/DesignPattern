package factory.simple;

import factory.CarType;
import factory.ICar;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class Test {
    public static void main(String[] args) {
        ICar car;
        Factory factory = new Factory();
        car = factory.createCar(CarType.cara);
        car.getCar();
    }
}
