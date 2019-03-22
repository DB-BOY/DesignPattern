package simplefactory;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.getOperation("+");
        System.out.println(operation.getResult(3, 1));
        operation = OperationFactory.getOperation("/");
        System.out.println(operation.getResult(3, 0));
        System.out.println(operation.getResult(3, 1));

    }
}
