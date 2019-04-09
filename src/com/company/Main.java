package com.company;

import com.company.Bitwise.NonDuplicateInteger;
import com.company.Trees.SumOfAllNodes;

import java.util.*;

public class Main {


    public static void main (String[] args){
        switch (Integer.parseInt(args[0])){
            case 1:
                BinarySearchTree binarySearchTree = new BinarySearchTree(7);
                break;
            case 2:
                PowerSet powerSet = new PowerSet();
                break;
            case 3:
                BinaryInsert binaryInsert = new BinaryInsert();
                break;
            case 4:
                MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
                break;
            case 5:
                LongestStringWithKDistinctCharacters longestStringWithKDistinctCharacters =
                        new LongestStringWithKDistinctCharacters();
                break;
            case 6:
                SecondLargestNodeBST secondLargestNodeBST = new SecondLargestNodeBST();
                break;
            case 7:
                SumOfAllNodes sumOfAllNodes = new SumOfAllNodes();
                break;
            case 8:
                NonDuplicateInteger nonDuplicateInteger = new NonDuplicateInteger();
            case 9:
                ConwaysGame conwaysGame = new ConwaysGame();
            case 10:
                AllSubsetOfArray allSubsetOfArray = new AllSubsetOfArray();
            case 11:
                StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        }

    }
}
