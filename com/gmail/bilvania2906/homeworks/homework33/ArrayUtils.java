package com.gmail.bilvania2906.homeworks.homework33;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo {
    String name();

    String returnType();

    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String firstName();

    String lastName();
}


class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Finds the maximum value in an array")
    @Author(firstName = "Ivan", lastName = "Biliak")
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @MethodInfo(name = "reverseArray", returnType = "int[]", description = "Reverses the given array")
    @Author(firstName = "Ivan", lastName = "Biliak")
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
