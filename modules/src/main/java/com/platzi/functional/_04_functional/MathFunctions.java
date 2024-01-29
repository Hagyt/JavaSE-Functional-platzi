package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction =
                new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer x) {
                        return x * x;
                    }
                };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        // New sintax, more compact and legible
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        // Predicate is a type of function that returns a boolean
        // In this case an interface more specific for this function
        // would be IntPredicate
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // Instead of apply() method we use test()
        isEven.test(4); // true

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student sinuhe = new Student(5.9);
        System.out.println(isApproved.test(sinuhe));
    }

    static class Student {
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
