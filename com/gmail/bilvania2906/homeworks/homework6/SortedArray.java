package com.gmail.bilvania2906.homeworks.homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {

        int[] array = new int[15];

        fillArray(array);
        System.out.println("It`s an array of " + array.length + " elements " + Arrays.toString(array));

        sortArray(array);
        System.out.println("It`s a sorted array " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter searching number: ");
        int numberToFind = scanner.nextInt();

        int index = binarySearch(array, numberToFind);

        if (index == -1) {
            System.out.println("Number " + numberToFind + " not found in the array");
        } else {
            System.out.println("Number " + numberToFind + " have index " + index + " in sorted array");
        }

    }

    public static void fillArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
