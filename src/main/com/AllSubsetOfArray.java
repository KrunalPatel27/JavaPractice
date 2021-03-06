package com;

import java.util.LinkedList;
import java.util.List;

public class AllSubsetOfArray {
    class Node{
        String val;
        Node next;

        public Node(String val) {
            this.val = val;
        }
    }
    Node head = null;
    Node tail = null;
    int totalNodes = 0;
    int[] arr = {1,2,3};
    public AllSubsetOfArray(){
        findAllSubset(arr);
        System.out.println();
    }

    private void findAllSubset(int[] arr) {
        System.out.println( );
        head = new Node("");
        tail = head;
        this.totalNodes++;
        System.out.println(":"+head.val);
        for(int i=0; i<arr.length; i++){
            String nextVal = Integer.toString(arr[i]);
            Node iter = head;
            int last = this.totalNodes;
            for(int j = 0; j < last; j++){
                newNode(iter.val + nextVal);
                System.out.println(":"+tail.val);
                iter = iter.next;
            }
        }
    }
    private Node newNode(String val){
        Node newNode = new Node(val);
        tail.next = newNode;
        this.tail = newNode;
        this.totalNodes++;
        return newNode;
    }


}
