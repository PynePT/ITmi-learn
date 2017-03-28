package Exercise7;

import Exercise6.Plus;

/**
 * Created by HomePC on 29.03.2017.
 */
public class AnCalculate {


    public static void main(String[] args) {
        // Создание экземпляра анонимного класса: new Operation {...}
        AnAccumulator acc = new AnAccumulator(100, new Operation() {
            @Override
            public int apply(int arg1, int arg2) {
                return arg1 + arg2;
            }
        });
        AnAccumulator acc1=new AnAccumulator(6, new Operation() {
            @Override
            public int apply ( int arg1, int arg2){
                return arg1 - arg2;
            }
        });
        AnAccumulator acc2=new AnAccumulator(18, new Operation() {
            @Override
            public int apply(int arg1, int arg2) {
                return arg1%arg2;
            }
        });
AnAccumulator acc3=new AnAccumulator(12, new Operation() {
    @Override
    public int apply(int arg1, int arg2) {
        return Math.abs(arg1)+Math.abs(arg2);
    }
});

        acc.calculate(-10);
        acc.calculate(23);
        acc1.calculate(9);
        acc1.calculate(19);
        acc2.calculate(12);
        acc2.calculate(98);
        acc3.calculate(15);
        acc3.calculate(638);
        System.out.println(acc.getValue());
        System.out.println(acc1.getValue());
        System.out.println(acc2.getValue());
        System.out.println(acc3.getValue());
    }
}
