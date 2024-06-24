package com.gmail.bilvania2906.homeworks.homework5;

import java.util.Random;


public class WorkWithArrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        int negativeSum = 0;
        int maxElement = 0;
        int minElement = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int evenElements = 0;
        int oddElements = 0;
        double average = 0;
        boolean foundNegativeElement = false;
        int sumAfterNegativeElement = 0;
        int countAfterNegativeElement = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(201) - 100;
        }


        for (int j : array) {
            if (j < 0) {
                negativeSum += j;
            }
        }


        for (int j : array) {
            if (j % 2 == 0) {
                evenElements++;

            } else {
                oddElements = array.length - evenElements;
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxIndex = i;
            } else if (minElement > array[i]) {
                minElement = array[i];
                minIndex = i;
            }



                if (!foundNegativeElement) {
                    foundNegativeElement = true;
                } else {
                    sumAfterNegativeElement += array[i];
                    countAfterNegativeElement++;
                }
                if (foundNegativeElement) {
                    average = (double) sumAfterNegativeElement / countAfterNegativeElement;
                }
            }



        System.out.println("Array elements " + java.util.Arrays.toString(array));
        System.out.println("The sum of the negative array elements" + negativeSum);
        System.out.println("Eve elements in array: " + evenElements);
        System.out.println("Odd elements in array: " + oddElements);
        System.out.println("Max element in array: " + maxElement + ". Index: " + maxIndex);
        System.out.println("Min element in array: " + minElement + ". Index: " + minIndex);
        if (foundNegativeElement) {
            System.out.printf("Average of array elements, after first negative element: %.2f.\n ", average);
        } else {
            System.out.println("There are no negative numbers");
        }
    }
}
