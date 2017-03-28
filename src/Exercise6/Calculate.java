package Exercise6;

import java.util.concurrent.Phaser;

/**
 * Created by HomePC on 26.03.2017.
 */
public class Calculate {
    public static void main(String[] args) {
        Accumulator acc = new Accumulator(new Plus(), 1) {
            @Override
            public double getValue() {
                return 0;
            }
        };
        acc.calculate(0);



        System.out.println(acc.getValue());
    }
}
