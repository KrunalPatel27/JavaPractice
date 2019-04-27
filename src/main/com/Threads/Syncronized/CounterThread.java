package com.Threads.Syncronized;

public class CounterThread extends Thread {
    protected Counter counter = null;
    String threadName;

    public CounterThread(Counter counter, String threadName){
        this.counter = counter;
        this.threadName = threadName;
    }

    public void run(){
        for(int i=0; i<10; i++){
            counter.add(i);
            System.out.println(threadName);
        }
    }
}
