package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments) {
        // A type of function that accept parameters, but it returns nothing
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp()) {
                System.out.println("Manual solicitado");
            }
        };

        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI() {
        // A type of function that accept no parmeters but returns a value
        Supplier<CLIArguments> generator = () -> new CLIArguments();

        return generator.get();
    }

    static void multiplicacion() {
        BiFunction<Integer, Integer, Integer> multi = (x, y) -> x * y;
    }
}
