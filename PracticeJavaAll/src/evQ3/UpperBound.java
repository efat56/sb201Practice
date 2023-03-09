package evQ3;

import java.util.Arrays;
import java.util.List;

public class UpperBound {

      /*
    //upper bounded wildcard.
    we can use an upper bounded wildcard to relax the restrictions on a variable.
     For example, if someone want to write a method that works on List<Integer>, List<Double>, and List<Number>;
     he or she  can achieve this by using an upper bounded wildcard.
     */
    public static double sum(List<? extends Number> numberlist) {
        double sum = 0.0;
        for (Number n : numberlist) sum += n.doubleValue();
        return sum;
    }

    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sum(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sum(doubleList));
    }

}
