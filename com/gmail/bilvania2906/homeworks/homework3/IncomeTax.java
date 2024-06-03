package com.gmail.bilvania2906.homeworks.homework3;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tax;

        System.out.println("Enter the amount of money income: ");
        int incomeMoney = scanner.nextInt();

        if (incomeMoney <= 10000) {
            tax = incomeMoney * 0.025;
            System.out.println("Tax is $: " + tax);
        } else if (incomeMoney > 10000 && incomeMoney <= 25000) {
            tax = incomeMoney * 0.043;
            System.out.println("Tax is $: " + tax);
        } else if (incomeMoney > 25000) {
            tax = incomeMoney * 0.067;
            System.out.println("Tax is $: " + tax);
        }

    }
}
