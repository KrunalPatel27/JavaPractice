package com.company;

import java.util.*;

public class Main {

    static List<String> lst1;
    static List<String> lst2;

    public static void main(String[] args) {
        generateRandomList();
        List<String> retObj;
        if(lst1.size()> lst2.size()) retObj = compare(lst1, lst2, lst2.size());
        else retObj = compare(lst2, lst1, lst1.size());

        for(String elm: retObj){
            System.out.println(elm);
        }
    }

    public static List<String> compare(List<String> maxLst, List<String> minLst, int minSize){
        HashSet<String> set = new HashSet<String>(minSize);
        List<String> retLst = new ArrayList<>();
        for(String elm: minLst){
            set.add(elm);
        }
        for(String elm: maxLst){
            if(set.contains(elm)) retLst.add(elm);
        }

        return retLst;
    }


    private static void generateRandomList() {
        lst1 = new ArrayList<String>(5);
        lst2 = new ArrayList<String>(5);
        //Same
        lst1.add("2a");lst2.add("2a");
        lst1.add("3a");lst2.add("3a");
        //Different
        lst1.add("1a");lst2.add("1b");
        lst1.add("4a");lst2.add("4b");
        lst1.add("5a");lst2.add("5b");
        lst2.add("6b");
    }
}
