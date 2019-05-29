package com.Trees;

public class CreateTrees {

    public static Node<Integer> getRandomTree1() {
        Node<Integer> root = new Node<>(50);
        root.left = new Node<>(25);
        root.right = new Node<>(75);
        root.left.setLeft(new Node<>(20));
        root.left.setRight(new Node<>(30));
        root.right.setLeft(new Node<>(70));
        root.right.setRight(new Node<>(80));

        return root;
    }
}
