package factory.simple;

import factory.CarType;
import factory.ICar;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class Factory {
    public ICar createCar(CarType type) {
        switch (type) {
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
