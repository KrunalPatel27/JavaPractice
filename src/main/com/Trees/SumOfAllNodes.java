package com.Trees;
import com.BinarySearchTree;


public class SumOfAllNodes {
    int sum=0;
    Node root;
    int[] arr1 = {1,10,2,3,4,20,15}; // Sum = 60
    int[] arr2 = {8,7,10,9,12}; // Sum = 51
    public SumOfAllNodes(){
        BinarySearchTree binarySearchTree = new BinarySearchTree(5, arr2);
        root = binarySearchTree.root;
        System.out.println(sum(binarySearchTree.root ));
    }
    public int sum( Node n){
        if(n == null) return 0;
        return sum(n.left) + sum(n.right) + (Integer)n.data;
    }

}
