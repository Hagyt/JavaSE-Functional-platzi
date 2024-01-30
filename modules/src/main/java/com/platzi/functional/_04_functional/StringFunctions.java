package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        /**
         * These functions extend from Function Interface, so they use apply() method
         */

        /**
         * UnityOperator -> It only needs a type. It is the type tha need as parameter
         * and the same type that need as return.
         */
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola Estudiante de platzi!"));

        System.out.println(addMark.apply("Hola"));

        /**
         * BinaryOperator -> Its behaviour is the same as UnityOperator, with the
         * difference that this function takes two values as parameters.
         */
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(5, 5));

        /**
         * BiFunction -> It's the same as BinaryOperator, but it needs that each parameter
         * and the return value be specified.
         */
        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));
        
    }
}
