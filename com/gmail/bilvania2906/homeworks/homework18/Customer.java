package com.gmail.bilvania2906.homeworks.homework18;

public class Customer {

    private final String name;
    private final String phone;
    private final String data;

    // Виправте визначення конструктора
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.data = "";
    }

    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }

    public String getData() {
        return data;
    }
}



