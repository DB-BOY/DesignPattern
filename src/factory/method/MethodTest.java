package factory.method;

import factory.ICar;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class MethodTest {
    public static void main(String[] args) {
        IFactory factory = new CarAFactory();
        ICar car = factory.careateCar();
        car.getCar();
    }
}
