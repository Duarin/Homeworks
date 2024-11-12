package com.gmail.bilvania2906.homeworks;

import java.util.Random;

public class ArrayUtils {
    public static int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        return array;
    }

    // Метод для виведення масиву
    public static void printArray(int[] array) {
        System.out.print("Array: [");
        for (int number : array) {
            System.out.print(number + ", ");

        }
        System.out.println("]");
    }
    public static void mergeSort(int[] array) {
        if (array.length < 2) return; // Якщо масив має менше двох елементів, він вже відсортований
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    // Метод бінарного пошуку
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                return middle; // Повертаємо індекс знайденого елемента
            }

            if (array[middle] < target) {
                left = middle + 1; // Шукаємо в правій частині
            } else {
                right = middle - 1; // Шукаємо в лівій частині
            }
        }

        return -1; // Елемент не знайдено
    }
}
