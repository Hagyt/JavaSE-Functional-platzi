package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NameUtils {

    public static void main(String[] args) {

        List<String> professors = getList("Nico", "John", "Sam");

        // The forEach() function accept a Consumer as parameter so we created one
        // to print the content
        Consumer<String> printer = text -> System.out.println(text);
        professors.forEach(printer);

        System.out.println("============================= DIVIDER =======================");

        // However we can use the reference operator for this cases
        professors.forEach(System.out::println);

        /**
         * The use of the reference operator is conditioned by the number and type
         * of parameters and the return. They have to be the same as the function in
         * which we want to execute.
         */
    }

    static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }

}
