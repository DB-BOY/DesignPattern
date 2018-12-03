package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationDiv;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
