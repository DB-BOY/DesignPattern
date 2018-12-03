package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationMul;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
