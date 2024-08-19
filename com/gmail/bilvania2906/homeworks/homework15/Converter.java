package com.gmail.bilvania2906.homeworks.homework15;

public class Converter {
    public static void main(String[] args) {
        System.out.println("This program converts kilometers to miles");
        System.out.println("10 miles in kilometers: " + milesToKilometers(10));


    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

}
