package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationAdd;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
