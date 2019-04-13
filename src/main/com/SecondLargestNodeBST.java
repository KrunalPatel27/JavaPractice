package com;

import com.Trees.Node;

/**
 *  This problem was asked by Dropbox.

    Given the root to a binary search tree, find the second largest node in the tree.
 */
public class SecondLargestNodeBST {
    int[] arr1 = {5,3,8,9,1,2,15,126,90,45}; //root: 20 2ndmax:90
    int[] arr2 = {20,8,1,12,15,18,16,123,45,60}; //root: 7 2ndMax:60
    int[] arr3 = {1,2,3}; // root: 7 2ndMax:3

    public SecondLargestNodeBST(){
        BinarySearchTree binarySearchTree = new BinarySearchTree(4, arr3);
        System.out.println(this.findSecondLargest(binarySearchTree));
    }

    private int findSecondLargest(BinarySearchTree binarySearchTree) {
        Node currentNode = binarySearchTree.root;
        Node previousNode = currentNode;
        while(currentNode.right!=null){
            previousNode = currentNode;
            currentNode = currentNode.right;
        }
        if(currentNode.left == null) return (int)previousNode.data;
        currentNode = currentNode.left;
        while(currentNode.right !=null){
            currentNode = currentNode.right;
        }

        return (int)currentNode.data;
    }


}
