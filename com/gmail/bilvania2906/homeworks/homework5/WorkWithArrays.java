package com.gmail.bilvania2906.homeworks.homework5;

import java.util.Random;

public class WorkWithArrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        int negativeSum=0;
        int maxElement=0;
        int minElement=0;
        int maxIndex=0;
        int minIndex=0;
        int evenElements=0;
        int oddElements=0;
        double average=0;
        boolean foundNegativeEl=false;
        int sumAfterNeg=0;
        int countAfterNeg=0;


        for (int number = 0; number < array.length; number++) {
            array[number] = rand.nextInt(201) - 100;
            if(array[number]<0){
                negativeSum+=array[number];
            }
            if(array[number]%2==0){
                evenElements++;
            }else if (array[number]%2!=0) {
                oddElements++;
            }
            if(maxElement<array[number]){
                maxElement=array[number];
                maxIndex=number;
            }else if(minElement>array[number]){
                minElement=array[number];
                minIndex=number;
            }
            if (!foundNegativeEl) {
                foundNegativeEl = true;
            } else {
                sumAfterNeg += array[number];
                countAfterNeg++;
                if (foundNegativeEl) {
                    average = (double) sumAfterNeg / countAfterNeg;
                }
            }
        }

        System.out.println("Array elements " + java.util.Arrays.toString(array));
        System.out.println("The sum of the negative array elements"+negativeSum);
        System.out.println("Eve elements in array: " + evenElements);
        System.out.println("Odd elements in array: " + oddElements);
        System.out.println("Max element in array: " + maxElement+". Index: "+maxIndex);
        System.out.println("Min element in array: " + minElement+". Index: "+minIndex);
        if (foundNegativeEl) {
            System.out.printf("Average of array elements, after first negative element: %.2f.\n " , average);
        } else {
            System.out.println("There are no negative numbers");
        }
    }
}
