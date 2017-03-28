package Exercise7;

/**
 * Created by HomePC on 29.03.2017.
 */

    public class AnAccumulator {
        private int value;
        private final Operation operation;
        public AnAccumulator(int initialValue, Operation operation) {
            this.value = initialValue;
            this.operation = operation;
        }
        public void calculate(int arg) {
            value = operation.apply(value, arg);
        }
        public int getValue() {
            return value;
        }
    }

