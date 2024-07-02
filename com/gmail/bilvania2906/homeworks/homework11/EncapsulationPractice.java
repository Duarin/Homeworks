package com.gmail.bilvania2906.homeworks.homework11;

import java.util.Scanner;

public class EncapsulationPractice {

    // Employee.java
    public static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int age;

        public Employee(String fullName, String position, String email, String phone, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.age = age;
        }

        // Getters and Setters for encapsulation
        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    // Car.java
    public static class Car {
        // Private methods to encapsulate the internal behavior
        private void startElectricity() {
            System.out.println("Starting electricity");
        }

        private void startCommand() {
            System.out.println("Starting command");
        }

        private void startFuelSystem() {
            System.out.println("Starting fuel system");
        }

        // Public method that uses the private methods
        public void start() {
            startElectricity();
            startCommand();
            startFuelSystem();
            System.out.println("Car has started");
        }

        // Main method to demonstrate the functionality
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your full name:");
            String fullName = scanner.nextLine();

            System.out.println("Enter your position:");
            String position = scanner.nextLine();

            System.out.println("Enter your email:");
            String email = scanner.nextLine();

            System.out.println("Enter your phone number:");
            String phone = scanner.nextLine();

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            Employee employee = new Employee(fullName, position, email, phone, age);
            System.out.println("Employee created: " + employee.getFullName());

            Car car = new Car();
            car.start();

            scanner.close();
        }
    }
}
