package com.gmail.bilvania2906.homeworks.homework8;

import java.util.Random;
import java.util.Scanner;


public class WorkWithMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter an integer to find its square: ");
        int number = scanner.nextInt();
        System.out.println("Square of " + number + ": " + square(number));

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        System.out.println("Volume of cylinder with radius " + radius + " and height " + height + ": " + volumeOfCylinder(radius, height));

        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("Sum of array elements: " + sumOfArray(array));

        System.out.print("Enter a string to reverse: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(str));

        System.out.print("Enter the base number (a): ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent (b): ");
        int exponent = scanner.nextInt();
        System.out.println(base + " raised to the power of " + exponent + ": " + power(base, exponent));

        System.out.print("Enter the number of times to print the text: ");
        int n = scanner.nextInt();
        System.out.print("Enter the text to print: ");
        scanner.nextLine();
        String text = scanner.nextLine();
        printTextMultipleTimes(n, text);

        scanner.close();
    }

    public static int square(int number) {
        return number * number;
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}

