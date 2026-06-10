package com.example;

public class Counter {

    private int count;

    public Counter() {
        reset();
    }

    public void reset() {
        count = 0;
    }
    // Trigger Sonar Analysis fixed
    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}