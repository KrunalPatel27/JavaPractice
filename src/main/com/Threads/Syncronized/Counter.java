package com.Threads.Syncronized;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    long count = 0;
    AtomicInteger a;
    public void add(long value){
        synchronized(this) {
//            System.out.println(a.addAndGet(1));
            this.count += value;
        }
    }
}
