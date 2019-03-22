package factory.method;

import factory.ICar;
import factory.simple.CarC;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class CarCFactory implements IFactory {
    @Override
    public ICar careateCar() {
        return new CarC();
    }
}
