package com.Trees;

public class Node<T> {
    public T data;

    public Node left = null;
    public Node right = null;

    public Node(T root) {
        this.data = root;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
