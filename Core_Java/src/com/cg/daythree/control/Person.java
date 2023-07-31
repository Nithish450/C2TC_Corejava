package com.cg.daythree.control;

public class Person {
    // Private variables (attributes) of the class
    private String name;
    private int age;

    // Public methods to access and modify the private variables (getters and setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Let's assume age cannot be negative
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person();

        // Use the setter methods to set the name and age
        person.setName("Raja");
        person.setAge(30);

        // Use the getter methods to get and display the name and age
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }}


