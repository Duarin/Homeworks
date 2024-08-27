package com.gmail.bilvania2906.homeworks.homework18;

public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();

        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"Ivan", "063-258-85-32"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
