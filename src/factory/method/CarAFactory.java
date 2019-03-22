package factory.method;

import factory.ICar;
import factory.simple.CarA;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class CarAFactory implements IFactory {
    @Override
    public ICar careateCar() {
        return new CarA();
    }
}
