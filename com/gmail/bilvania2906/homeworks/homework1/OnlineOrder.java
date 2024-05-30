package com.gmail.bilvania2906.homeworks.homework1;

import java.util.Scanner;

public class OnlineOrder {

    public static void main(String[] args) {
        new Scanner(System.in);
        String Name = "Alice";
        String Product = "smartphone";
        System.out.println("Put price: ");
        double Price = 350.99;
        byte Street = 10;
        System.out.println("Order No 1 Client: " + Name + ".");
        System.out.println("Product: " + Product + ",");
        System.out.println("Price EUR " + Price + ".");
        System.out.println("Address: Moon Street, " + Street + ".");
        Name = "Tom";
        Product = "laptop";
        Price = 570.95;
        Street = 17;
        System.out.println("Order No 2 Client: " + Name + ".");
        System.out.println("Product: " + Product + ",");
        System.out.println("Price EUR " + Price + ".");
        System.out.println("Address: Moon Street, " + Street + ".");
    }
}