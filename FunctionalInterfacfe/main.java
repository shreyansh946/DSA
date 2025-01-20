package FunctionalInterfacfe;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {
    public static void main(String args[])
    {

     //Consumer is that operation that accept a single input parameter and return no result.
        Consumer<Integer> loggingObject = (Integer val) -> {
            if (val > 10) {
                System.out.println("Value is greater than 10: "
                        + val);
            } else {
                System.out.println("Value is less than or equal to 10: "
                        + val);
            }
        };

        // Testing the Consumer
        loggingObject.accept(15);  // Output: Value is greater than 10: 15
        loggingObject.accept(5);


    //that accept one  agrugment and return the boolean.
        Predicate<Integer> isGreaterThanTen = (Integer val) -> val > 10;

        System.out.println("Predicate Test (15): " +
                isGreaterThanTen.test(15)); // true
        System.out.println("Predicate Test (5): " +
                isGreaterThanTen.test(5));   // false

        // Supplier example: Provides a random number between 1 and 100

        //Accept no input parameter  but produce a result.
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

        System.out.println("Supplier Test: Random number: " +
                randomNumberSupplier.get());

        // Function example: Square the input value
        //function that accept one argument process it and produce a result.
        Function<Integer, Integer> square = (Integer val) -> val * val;

        System.out.println("Function Test (5): " + square.apply(5)); // 25
        System.out.println("Function Test (7): " + square.apply(7)); // 49
    }
}
