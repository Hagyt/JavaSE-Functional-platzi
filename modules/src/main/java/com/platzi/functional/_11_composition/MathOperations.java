package com.platzi.functional._11_composition;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class MathOperations {

    public static void main(String[] args) {
        IntUnaryOperator multyplyBy3 = x -> {
            System.out.println("Multiplying x: " + x + " by 3");
            return x * 3;
        };

        // Compose executes the lambda passed as parameter before the function we are composing.
        IntUnaryOperator add1BeforeMultiplyBy3 =
                multyplyBy3.compose(y -> {
                    System.out.println("Adding 1 to: " + y);
                    return y + 1;
                });

        IntUnaryOperator andSquare =
                add1BeforeMultiplyBy3.andThen(z -> {
                    System.out.println("Squaring " + z + " squared");
                    return z * z;
                });

        System.out.println(add1BeforeMultiplyBy3.applyAsInt(5));

        System.out.println("==== Divider ====");

        System.out.println(andSquare.applyAsInt(3));
    }
}
