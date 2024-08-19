package com.gmail.bilvania2906.homeworks.homework15;

public class Converter {
    public static void main(String[] args) {
        System.out.println("This program converts kilometers to miles");
        System.out.println("10 miles in kilometers: " + milesToKilometers(10));
        System.out.println("22 kilometers in miles " + kilometersInMiles(22));


    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersInMiles(double kilometers) {
        return kilometers / 1.60934;
    }

}
