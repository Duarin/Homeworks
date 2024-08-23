package com.gmail.bilvania2906.homeworks.homework17;

public class Converter3 {
    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter app.");

        System.out.println("Version1.0.");
        double kgs = 5;
        double pnds = 12;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKilos(pnds);
        System.out.println("Result is: " + pounds + " pounds and "+kilos+" kgs.");
    }

    private static double convPoundsToKilos(double pnds) {
        return pnds / CONV_K;
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}
