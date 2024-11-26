package com.gmail.bilvania2906.homeworks.homework33;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Method Name: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
                System.out.println("---------------------------------");
            }
        }

        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Max Value: " + ArrayUtils.findMax(sampleArray));

        int[] reversedArray = ArrayUtils.reverseArray(sampleArray);
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
