package com.Trees;

import java.util.ArrayList;
import java.util.Queue;

public class DFS_LargestBinaryTree {

    class StackObj {
        Node node;
        int depthVal;
        public StackObj( Node node, int depthVal){
            this.node = node;
            this.depthVal = depthVal;
        }
    }
    ArrayList<StackObj> list = new ArrayList<>();

    Node<Integer> root;

    public DFS_LargestBinaryTree() {
        root = CreateTrees.getRandomTree1();
        System.out.println("Tree larges BST: "+largest_BST_SubTree(root));
    }

    private int largest_BST_SubTree(Node<Integer> root){
        list.add(new StackObj(root, 0));
        int max=0;
        while(list.size() >0){
            if(list.get(0).node != null) evalateNode(list.get(0).node, list.get(0).depthVal);
            else if(list.get(0).depthVal > max) max = list.get(0).depthVal;
            list.remove(0);
        }

        return max;
    }

    private void evalateNode(Node<Integer> node, int depthCount) {

        if(node.left == null) list.add(new StackObj(null, depthCount));
        else if((int)node.left.data < node.data){
            list.add(new StackObj(node.left, depthCount+1));
        }
        if(node.right == null) list.add(new StackObj(null, depthCount));
        else if((int)node.right.data < node.data){
            list.add(new StackObj(node.right, depthCount+1));
        }
    }




}
