package factory.abstractf;

/**
 * Created by DB_BOY on 2018/12/18.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Car")) {
            return new CarFactory();
        }
        return null;
    }
}
