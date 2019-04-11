package com.company.Trees;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int root) {
        this.data = root;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
}
