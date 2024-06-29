package com.gmail.bilvania2906.homeworks.homework10;

import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(4, 4);
        fillMatrixRandomly(matrix, 1, 50);
        printMatrix(matrix);

        int sumEvenRows = sumElementsInEvenRows(matrix);
        int sumOddRows = sumElementsInOddRows(matrix);
        int productEvenCols = productElementsInEvenColumns(matrix);
        int productOddCols = productElementsInOddColumns(matrix);

        System.out.println("Sum of elements in even rows: " + sumEvenRows);
        System.out.println("Sum of elements in odd rows: " + sumOddRows);
        System.out.println("Product of elements in even columns: " + productEvenCols);
        System.out.println("Product of elements in odd columns:" + productOddCols);

        if (isMagicSquare(matrix)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix isn`t a magic square.");
        }
    }

    public static int[][] createMatrix(int rows, int cols) {
        return new int[rows][cols];
    }

    public static void fillMatrixRandomly(int[][] matrix, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public static int sumElementsInEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int sumElementsInOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int productElementsInEvenColumns(int[][] matrix) {
        int product = 1;
        for (int j = 0; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    public static int productElementsInOddColumns(int[][] matrix) {
        int product = 1;
        for (int j = 1; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int sum = 0;
        for (int num : matrix[0]) {
            sum += num;
        }

        for (int i = 1; i < matrix.length; i++) {
            int rowSum = 0;
            for (int num : matrix[i]) {
                rowSum += num;
            }
            if (rowSum != sum) {
                return false;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != sum) {
                return false;
            }
        }

        int diagSum1 = 0, diagSum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagSum1 += matrix[i][i];
            diagSum2 += matrix[i][matrix.length - 1 - i];
        }
        if (diagSum1 != sum || diagSum2 != sum) {
            return false;
        }

        return true;
    }
}