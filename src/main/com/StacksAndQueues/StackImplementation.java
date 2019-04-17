package com.StacksAndQueues;

import java.util.LinkedList;

/**
 * Implement a stack that has the following methods:
 *
 *     push(val), which pushes an element onto the stack
 *
 *     pop(), which pops off and returns the topmost element of the stack.
 *     If there are no elements in the stack, then it should throw an error or return null.
 *
 *     max(), which returns the maximum value in the stack currently.
 *     If there are no elements in the stack, then it should throw an error or return null.
 *
 * Each method should run in constant time O(1).
 */
public class StackImplementation {
    Node top;

    class Node{
        int val;
        Node before;
        int currMaxVal;
        public Node (int val, Node before, int currMaxVal){
            this.val = val;
            this.before = before;
            this.currMaxVal = currMaxVal;
        }

    }

    public StackImplementation(){
        this.InitializeStack();
        System.out.println(top.currMaxVal);
        top = top.before;
        System.out.println(top.currMaxVal);
        top = top.before;
        System.out.println(top.currMaxVal);
        top = top.before;
        System.out.println(top.currMaxVal);

    }

    private void InitializeStack() {
        top = this.Node(top, 2);
        top = this.Node(top, 5);
        top = this.Node(top, 4);
        top = this.Node(top, 7);
    }

    public Node Node(Node previousNode, int newVal) {
        if(previousNode == null){
            return new Node(newVal, null, newVal);
        }
        if(previousNode.currMaxVal < newVal){
            return new Node(newVal, previousNode, newVal);
        }else{
            return new Node(newVal, previousNode, previousNode.currMaxVal);
        }
    }
}
