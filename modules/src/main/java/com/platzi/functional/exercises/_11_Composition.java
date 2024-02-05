package com.platzi.functional.exercises;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class _11_Composition {
    //TODO: Crear una funcion o grupo de funciones que puedan calcular: x^2 + y^2 + 2xy
    // usando unicamente los operadores: *, + una vez por funcion.
    // Es decir, Math.pow no esta permitido. y funciones del estilo: a * b + c no estan permitidas.
    public static BiFunction<Integer, Integer, Integer> generateEquation() {
        //Ejemplo:
        // Function<Integer, Integer> toNegative = x -> -x;

        // Y aqui tienes un regalo para este ejercicio (tienes que usar esta funcion en el codigo final):
        IntUnaryOperator multiplyBy2 = x -> x * 2;

        IntUnaryOperator square = x -> x * x;

        IntBinaryOperator multiplyNumbers = (x, y) -> x * y;

        IntBinaryOperator sumNumbers = (x, y) -> x + y;


        return (x, y) -> sumNumbers.applyAsInt(
                sumNumbers.applyAsInt(
                        square.applyAsInt(x),
                        square.applyAsInt(y)
                ),
                multiplyBy2.applyAsInt(multiplyNumbers.applyAsInt(x, y))
        );
    }

    public static void main(String[] args) {
        Integer x = 2;
        Integer y = 3;
        System.out.println(generateEquation().apply(x, y));
    }
}
