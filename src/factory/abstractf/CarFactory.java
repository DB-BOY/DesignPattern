package factory.abstractf;

import factory.CarType;
import factory.ICar;
import factory.simple.CarA;
import factory.simple.CarB;
import factory.simple.CarC;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class CarFactory extends AbstractFactory {
    @Override
    public ICar getCar(CarType car) {
        switch (car) {
            case cara:
                return new CarA();
            case carb:
                return new CarC();
            case carc:
            default:
                return new CarB();
        }
    }
}
