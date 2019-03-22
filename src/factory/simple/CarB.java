package factory.simple;

import factory.ICar;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class CarB implements ICar {
    @Override
    public void getCar() {
        System.out.println("CarB: ");
    }
}
