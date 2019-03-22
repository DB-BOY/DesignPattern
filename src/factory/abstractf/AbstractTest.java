package factory.abstractf;

import factory.CarType;
import factory.ICar;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class AbstractTest {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("Car");
        ICar car = factory.getCar(CarType.cara);
        car.getCar();
    }
}
