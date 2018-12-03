package factorymethod;

import simplefactory.Operation;

/**
 * Created by gin on 2018/11/30.
 */
public interface IFactory {
    Operation createOperation();
}
