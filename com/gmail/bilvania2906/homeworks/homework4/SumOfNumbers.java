package com.gmail.bilvania2906.homeworks.homework4;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float fromNumber;
        float toNumber;
        float sum = 0;
        int num = 0;

        System.out.println("Enter the range of numbers");
        System.out.println("From: ");
        fromNumber = scanner.nextFloat();
        System.out.println("To: ");
        toNumber = scanner.nextFloat();
        float subtractingNumbers = toNumber - fromNumber;

        while (fromNumber <= toNumber) {
            if (num <= subtractingNumbers) {
                num++;
            }
            sum = sum + fromNumber;
            System.out.print("Num " + num + " is: " + fromNumber);
            System.out.printf(", sum is: %.2f.\n", sum);
            fromNumber++;

        }
    }
}
