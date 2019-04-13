package com.Trees;

/**
 * Suppose an arithmetic expression is given as a binary tree.
 * Each leaf is an integer and each internal node is one of 
 * '+', '-', '*', '/'.
 * 
 * Given the root to such a tree, write a function to evaluate it.
 *            *
 *         /    \
 *        +      +
 *      /  \    / \
 *     2    3  4   5
 * You should return 45, as it is (2+3)*(4+5)
 */
public class ArithmeticExpressionTree {
    Node root;
    public ArithmeticExpressionTree(){
        this.createTree();
        System.out.println(solve(root));
    }

    private int solve(Node n) {
        if(n == null) return 0;
        int val;
        int left = solve(n.left);
        int right = solve(n.right);
        if( '*' == (char)n.data ){
            val = left * right;
        }else if('/' == (char)n.data){
            val = left/right;
        }else if('+' == (char)n.data){
            val = left + right;
        }else if('-' == (char)n.data){
            val = left - right;
        }else{
            return Character.getNumericValue((char)n.data);
        }
        return val;
    }

    private void createTree() {
        root = new Node('*');
        root.left = new Node('+');
        root.right = new Node('+');
        root.left.left = new Node('3');
        root.left.right = new Node('2');
        root.right.left = new Node('4');
        root.right.right = new Node('5');
    }
}
