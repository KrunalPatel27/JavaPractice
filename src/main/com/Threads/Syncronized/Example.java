package com.Threads.Syncronized;

public class Example {
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread  threadA = new CounterThread(counter, "t1");
        Thread  threadB = new CounterThread(counter, "t2");

        threadA.start();
        threadB.start();
    }
}
