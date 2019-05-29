package com.Trees;


public class MainTrees {
    public static void main (String[] args) throws Exception {
        switch (Integer.parseInt(args[0])){
            case 1:
                TravesalToTree travesalToTree = new TravesalToTree();
                break;
            case 2:
                ArithmeticExpressionTree arithmeticExpressionTree
                        = new ArithmeticExpressionTree();
                break;
            case 3:
                DFS_LargestBinaryTree dfs_largestBinaryTree
                        = new DFS_LargestBinaryTree();
        }

    }
}
