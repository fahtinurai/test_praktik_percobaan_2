package com.example;

public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println(counter.getCount());

        counter.increment();

        System.out.println(counter.getCount());

        counter.decrement();

        System.out.println(counter.getCount());
    }
}