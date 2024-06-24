package com.gmail.bilvania2906.homeworks.homework2;

import java.util.Scanner;

public class OrdersByWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float productPrice;
        float productQuantity;
        float offerDays = 6;
        System.out.println("Enter price for product No1: ");
        productPrice = scanner.nextFloat();

        System.out.println("Enter the amount of products sold for one day: ");
        productQuantity = scanner.nextFloat();
        float revenuePerDay = productPrice * productQuantity;
        System.out.println("Price for product No 1: AirPods Pro: " + productPrice);

        float SumRevenuePerDays = revenuePerDay * offerDays;
        System.out.println("Total sales for 6 days is EUR " + SumRevenuePerDays);
        System.out.printf("Revenue per day: %.2f.\n", revenuePerDay);
        System.out.println("Enter price for product no2: ");
        productPrice = scanner.nextFloat();

        System.out.println("Enter the amount of products sold for one day: ");
        productQuantity = scanner.nextFloat();
        revenuePerDay = productPrice * productQuantity;
        System.out.println("Price for product No 1: Iphone: " + productPrice);
        offerDays = 10;
        SumRevenuePerDays = revenuePerDay * offerDays;
        System.out.println("Total sales for 10 days is EUR " + SumRevenuePerDays);
        System.out.println("Revenue per day: %.2f." + revenuePerDay);

    }
}
