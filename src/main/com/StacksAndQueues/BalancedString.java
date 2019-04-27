package com.StacksAndQueues;

import java.util.Stack;

public class BalancedString {
    Stack<Character> stack = new Stack<>();
    char exp[] = new char[]{'(','(',')',')'};
    public BalancedString(){
        if(isExpressionBalanced(exp.length))
            System.out.printf("Balanced!!");
        else
            System.out.printf("Not Balanced");
    }

    private boolean isExpressionBalanced(int length) {
        for(int i =0; i<length; i++){
            if(exp[i] == '{' || exp[i]=='(' || exp[i]=='['){
                stack.add(exp[i]);
            }else{
                if(stack.empty()) return false;
                if(!isMatching(stack.pop(),exp[i])) return false;
            }
        }
        return stack.empty() ? true: false;
    }

    private boolean isMatching(char c1, char c2) {
        if(c1 =='(' && c2==')')return true;
        if(c1 =='{' && c2=='}')return true;
        if(c1 =='[' && c2==']')return true;
        return false;
    }
}
