package com;

import com.Trees.Node;

public class BinarySearchTree {
    public int[] data = {5,2,3,4,9,10,6};
    public Node root;

    public BinarySearchTree( int root){
        this.root = new Node(root);
        for(int i: data) insert(i);
    }
    public BinarySearchTree( int root, int[] data){
        this.root = new Node(root);
        for(int i: data) insert(i);
    }
    private void insert(int data){
        Node currNode = this.root;
        while(true) {
            if (data <= (Integer) currNode.data) {
                if (currNode.left != null) {
                    currNode = currNode.left;
                }else {
                    this.addNode(data, currNode, true);
                    return;
                }
            } else {
                if (currNode.right != null) {
                    currNode = currNode.right;
                }else {
                    this.addNode(data, currNode, false);
                    return;
                }
            }
        }

    }

    private void addNode(int data, Node currNode, boolean left) {
        Node n = new Node(data);
        if(left)currNode.left  = n;
        else currNode.right = n;
    }
}
