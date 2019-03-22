package factory.method;

import factory.ICar;
import factory.simple.CarB;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class CarBFactory implements IFactory {
    @Override
    public ICar careateCar() {
        return new CarB();
    }
}
