package com.company;

import java.util.*;

/**
 * given a string s and integer k, find longest substring with k distinct letters
 * given a string s= "abcbe" and k=2, return bcb
 *
 * s = "abcbcccccccb"
 *
 *  char| count | startIndex | endIndex
 *  a   |   1   |   0   |   0
 *  b   |   1   |   1   |   1
 *  c   |   1   |   2   |   2
 *  b   |   2   |   1   |   3
 *  e   |   1   |   4   |   4
 */

public class LongestStringWithKDistinctCharacters {

    private int maxSubstringLength;
    private String maxSubstring;
    private int currentMax;
    LinkedList<Character> lList;
    HashMap<Character,Integer> currentWindowCharacters;
    StringBuilder builder = new StringBuilder();

    public LongestStringWithKDistinctCharacters(){
        this.maxSubstring = "";
        System.out.println(longestSubStringWithKDistinctCharacterUniDirectional("abcbe", 2));
    }

    private String longestSubStringWithKDistinctCharacterUniDirectional(String input, int k) {
        int totalInputLength = input.length();
        currentWindowCharacters = new HashMap<Character, Integer>(k);
        lList = new LinkedList<Character>();
        int currentCount=0;

        for(int i = 0; i<totalInputLength; i++){
            char ch = input.charAt(i);
            if(currentCount<k && !currentWindowCharacters.containsKey(ch)){
                addToQueue(ch);
                currentCount++;
            }else if(!currentWindowCharacters.containsKey(ch)){
                popResetAdd(ch);
            }
            currentWindowCharacters.put(ch, currentMax);
            currentMax++;
        }
        return null;
    }

    private void popResetAdd(Character ch) {
        char last =  lList.removeLast().charValue();
        lList.add(ch);
        String temp = builder.toString();
        if(temp.length() > maxSubstringLength){
            maxSubstringLength = temp.length();
            maxSubstring = temp;
        }
        int index = currentWindowCharacters.get(last);
        builder.delete(0,index);
        currentMax -=index;
    }

    private void addToQueue(Character e) {
        lList.add(e);
        builder.append(e);
    }


//    private String longestSubStringWithKDistinctCharacterUniDirectional(String str) {
//        HashMap<Character,Data> hm = new HashMap<>();
//        for(int i =0; i< str.length(); i++){
//            char ch = str.charAt(i);
//            if(hm.containsKey(ch)){
//                hm.get(ch).count++;
//                hm.get(ch).endIndex = i;
//            }else{
//                Data data = new Data();
//                data.ch = ch;
//                data.startIndex = i;
//                data.count++;
//                hm.put(ch, data);
//            }
//        }
//        return "";
//    }
//
//    class Data{
//        char ch;
//        int count;
//        int startIndex;
//        int endIndex;
//
//    }

}
