package com.company.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given pre-order and in-order traversals of a binary tree, write a function to reconstruct the tree.
 *
 * For Example, given the following preorder traversal:
 * [1,2,4,5,3,6,7]
 * And the following inorder traversal:
 * [4,2,5,1,6,3,7]
 * You should return the following tree:
 *          1
 *        /   \
 *       2     3
 *     /  \   / \
 *    4   5  6   7
 *
*/
public class TravesalToTree {
    Node root;
    int[] preOrder = {1,2,4,5,3,6,7};
    int[] inOrder = {4,2,5,1,6,3,7};
    LinkedList<Integer> stack = new LinkedList<>();

    public TravesalToTree(){
        this.generateTree();
    }

    private void generateTree() {
        this.root = new Node(preOrder[0]);
        stack.add(preOrder[0]);
        for(int i=1; i< preOrder.length; i++){
            this.insert(preOrder[i]);
        }
    }

    private void insert(int i) {
        for()
    }
}
