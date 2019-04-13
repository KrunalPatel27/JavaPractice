package com.Trees;

public class Node<T> {
    public T data;

    public Node left;
    public Node right;

    public Node(T root) {
        this.data = root;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
}
