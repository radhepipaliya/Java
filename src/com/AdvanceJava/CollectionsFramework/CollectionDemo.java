package com.AdvanceJava.CollectionsFramework;

import java.util.*;
import java.util.stream.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        // add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After add(): " + fruits);

        // addAll(Collection<? extends E> c)
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // contains(Object o)
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // containsAll(Collection<?> c)
        System.out.println("Contains all moreFruits? " + fruits.containsAll(moreFruits));

        // size()
        System.out.println("Size: " + fruits.size());

        // isEmpty()
        System.out.println("Is Empty? " + fruits.isEmpty());

        // iterator()
        System.out.println("Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // stream()
        System.out.println("Stream:");
        fruits.stream().forEach(System.out::println);

        // parallelStream()
        System.out.println("Parallel Stream:");
        fruits.parallelStream().forEach(System.out::println);

        // remove(Object o)
        fruits.remove("Banana");
        System.out.println("After remove(): " + fruits);

        // removeIf(Predicate)
        fruits.removeIf(f -> f.startsWith("G"));
        System.out.println("After removeIf(): " + fruits);

        // retainAll(Collection<?> c)
        Collection<String> keep = new ArrayList<>();
        keep.add("Apple");
        fruits.retainAll(keep);
        System.out.println("After retainAll(): " + fruits);

        // hashCode()
        System.out.println("HashCode: " + fruits.hashCode());

        // equals(Object o)
        Collection<String> another = new ArrayList<>();
        another.add("Apple");
        System.out.println("Equals another collection? " + fruits.equals(another));

        // toArray()
        Object[] arr = fruits.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // spliterator()
        Collection<String> nums = new ArrayList<>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");

        Spliterator<String> sp = nums.spliterator();
        System.out.println("Spliterator:");
        sp.forEachRemaining(System.out::println);
    }
}
