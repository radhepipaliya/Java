package com.qspider.NonStatic;

public class Task {

    public static void main(String[] name){

// 1. Create a class `Person` with non-static fields `name` (String) and `age` (int). Write a non-static method `printDetails()` that prints the person's name and age. Instantiate an object and call the method.
        Person p = new Person("Radhe",22);
        p.printDetails();
    }

}
