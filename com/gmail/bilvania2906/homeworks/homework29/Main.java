package com.gmail.bilvania2906.homeworks.homework29;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition result: " + addition.operate(5, 3));

        StringManipulator toUpperCase = s -> s.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.manipulate("hello"));

        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        System.out.println("Uppercase count: " + uppercaseCounter.apply("Hello World!"));

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number: " + randomSupplier.get());
    }
}
