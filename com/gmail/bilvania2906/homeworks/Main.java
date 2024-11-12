package com.gmail.bilvania2906.homeworks;

public class Main {
    public static void main(String[] args) {


        int[] array = ArrayUtils.createRandomArray(100, 1, 100);
        ArrayUtils.printArray(array);

        ArrayUtils.mergeSort(array);
        System.out.println("Sorted Array:");
        ArrayUtils.printArray(array);

        int target = 34;
        int result = ArrayUtils.binarySearch(array, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
