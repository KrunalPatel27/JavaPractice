package com.company.Trees;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    int length;


    public TravesalToTree() throws Exception {
        this.length = preOrder.length;
        root = new Node(preOrder[0]);
        this.generateTree(0, length, 0, root);
        PreOrder(root);
        System.out.println(" equals ");
        Arrays.stream(preOrder).forEach(e-> System.out.print(e));

        System.out.println();

        InOrder(root);
        System.out.println(" equals ");
        Arrays.stream(inOrder).forEach(e-> System.out.print(e));

    }

    private int generateTree(int min, int max, int index, Node n) throws Exception {
        if(min == max) return index;
        if(!(index >=0 && index < length)) throw new Exception("Out of Bounds Index");

        int currIndex = findFromInOrder(preOrder[index]);
        if(currIndex>min){
            Node left = new Node(preOrder[++index]);
            n.left = left;
            index = generateTree(min, currIndex-1,index, left );
        }
        if(currIndex<max && index< length-1){
            Node right = new Node(preOrder[++index]);
            n.right = right;
            if(index < length)
                index = generateTree(currIndex+1,max,index, right);
        }
        return index;
    }

    private int findFromInOrder(int val) {
        for(int i =0; i < length; i++){
            if(val == inOrder[i])return i;
        }
        return -1;
    }

    // root, left, right
    public void PreOrder(Node n){
        if(n == null)return;
        System.out.print(n.data);
        PreOrder(n.left);
        PreOrder(n.right);
    }

    // left, root, right
    public void InOrder(Node n){
        if(n == null)return;
        InOrder(n.left);
        System.out.print (n.data);
        InOrder(n.right);
    }

}
