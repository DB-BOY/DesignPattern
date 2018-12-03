package factorymethod;

import simplefactory.Operation;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        System.out.println(operation.getResult(1,9));

    }
}
