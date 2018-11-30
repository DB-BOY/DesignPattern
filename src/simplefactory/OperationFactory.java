package simplefactory;

/**
 * Created by DB_BOY on 2018/11/30.
 */
public class OperationFactory {

    public static Operation getOperation(String operate) {

        Operation operation;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                operation = new OperationAdd();
                break;
        }
        return operation;
    }
}
