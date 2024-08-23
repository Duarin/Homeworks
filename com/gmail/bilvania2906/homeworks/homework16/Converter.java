package com.gmail.bilvania2906.homeworks.homework16;

public class Converter {
    public static void main(String[] args) {
        System.out.println("This program converts fahrenheits to celsius");
        System.out.println("50  fahrenheits in celsius: " + fahrenheitsInCelsius(50));
        System.out.println("100 celsius in fahrenheits : " + celsiusInFahrenheits(100));
    }

    public static double fahrenheitsInCelsius(double F) {
        return (F - 32) / 1.8;
    }

    public static double celsiusInFahrenheits(double C) {
        return (C * 9 / 5) + 32;
    }
}
