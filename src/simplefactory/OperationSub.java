package simplefactory;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class OperationSub implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a-b;
    }
}
