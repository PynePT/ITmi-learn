package Exercise6;


/**
 * Created by HomePC on 24.03.2017.
 */
public class Accumulator {

    private Operation operation;
    private double value;

    public Accumulator(Operation operation, double value) {

        this.operation = operation;
        this.value = value;
    }


    public double calculate(double c) {

        value = operation.apply(value, c);
        return value;
    }


    public double getValue() {
        return value;
    }
}





