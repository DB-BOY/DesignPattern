package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationSub;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
