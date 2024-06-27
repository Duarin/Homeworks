package com.gmail.bilvania2906.homeworks.homework9;

public class WorkWithClasses {
    public static class Person {
        private final String name;
        private final int age;
        private String profession;


        public Person(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }


        public void setProfession(String newProfession) {
            this.profession = newProfession;
        }


        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Profession: " + profession);
        }

        public static void main(String[] args) {

            Person person1 = new Person("Ivan", 30, "Engineer");
            Person person2 = new Person("Ilja", 25, "Teacher");
            Person person3 = new Person("Maksim", 40, "Doctor");

            System.out.println("Information about Person 1:");
            person1.displayInfo();
            System.out.println("\nInformation about Person 2:");
            person2.displayInfo();
            System.out.println("\nInformation about Person 3:");
            person3.displayInfo();

            person2.setProfession("Software Developer");
            System.out.println("\nUpdated information about Person 2:");
            person2.displayInfo();
        }
    }
}
