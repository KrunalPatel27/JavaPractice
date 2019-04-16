package com.StacksAndQueues;

import java.util.Stack;

/**
 * Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out)
 *  data structure with the following methods:
 *  @enqueue(int val), which inserts an element into the queue, and
 *  @dequeue(), which removes it.
 */
public class QueueUsingStacks {
    Stack<Integer> a = new Stack<Integer>();
    Stack<Integer> b = new Stack<Integer>();

    public QueueUsingStacks(){
        initializeQueue();
        System.out.println(dequeue() + " equals 1");
        System.out.println(dequeue() + " equals 2");
        System.out.println(dequeue() + " equals 3");

    }

    private void enqueue(int val) {
        a.push(val);
    }

    private int dequeue() {
        while(!a.empty()){
            b.push(a.pop());
        }
        int val = b.pop();
        while (!b.empty()){
            a.push(b.pop());
        }
        return val;
    }

    private void initializeQueue() {
        enqueue(1);
        enqueue(2);
        enqueue(3);

    }
}
