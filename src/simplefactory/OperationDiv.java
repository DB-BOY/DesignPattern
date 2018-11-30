package simplefactory;


/**
 * Created by DB_BOY on 2018/11/30.
 */
public class OperationDiv implements Operation {
    @Override
    public double getResult(double a, double b) {
        double result ;
        try {
            result = a/b;
        }catch (Exception e){
            result = 0;
        }
        return result;
    }
}
