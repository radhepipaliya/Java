package com.qspider.NonStatic;

public class Person {
        String name;
        int age;


        public void printDetails(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);

        }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
