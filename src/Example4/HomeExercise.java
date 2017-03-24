package Example4;

import com.company.Adder;

/**
 * Created by HomePC on 20.03.2017.
 */
public class HomeExercise {

    public static void main(String[]args) {
        Adder adder = new Adder();

        adder.increment();
        int val = adder.getValue();

        System.out.println(val);
    }
}


