package com.qspider.ConstructorOverloading;

public class Student {
    String name;
    int age;
    String email;

    public Student(){
        System.out.println("No Args Constructor called");

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age){
        this(name);
        this.age=age;
    }

    public Student(String name, int age, String email) {
        this(name,age);
        this.email = email;
    }
}
