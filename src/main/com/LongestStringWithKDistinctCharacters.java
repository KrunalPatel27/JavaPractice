package com;

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
    int start =0;
    private String maxSubstring;
    private int currentMax = 0;
    LinkedList<Character> lList;
    HashMap<Character,Integer> currentWindowCharacters;
    StringBuilder builder = new StringBuilder();

    public LongestStringWithKDistinctCharacters(){
        this.maxSubstring = "";
        System.out.println(longestSubStringWithKDistinctCharacterUniDirectional("abcbeebccbccb", 2));
    }

    private String longestSubStringWithKDistinctCharacterUniDirectional(String input, int k) {
        int inputLength = input.length();
        currentWindowCharacters = new HashMap<Character, Integer>(k);

        for(int i =0; i< inputLength; i++){
            char ch = input.charAt(i);
            if(currentWindowCharacters.size()== k){
                if(!currentWindowCharacters.containsKey(ch)){
                    popFirstOfWindow();
                }
            }
            addToWindow(ch);
        }
        popFirstOfWindow();
        return maxSubstring;
    }

    public char popChar(){
        int low=-1;
        char retChar = ' ';
        for (char ch: currentWindowCharacters.keySet()) {
            if(low == -1){
                low = currentWindowCharacters.get(ch);
                retChar = ch;
            }
            if(low > currentWindowCharacters.get(ch)) {
                low = currentWindowCharacters.get(ch);
                retChar = ch;
            }
        }
        return retChar;
    }

    private void popFirstOfWindow() {
        char toPop = popChar();
        String temp = builder.substring(start);
        // System.out.println("tempStr: "+ temp + ", size: "+temp.length());
        if(temp.length() > maxSubstringLength){
            maxSubstring = temp;
            maxSubstringLength = temp.length();
        }
        start = currentWindowCharacters.get(toPop) + 1;
        currentWindowCharacters.remove(toPop);
    }

    private void addToWindow(char ch) {
        currentWindowCharacters.put(ch, currentMax++);
        builder.append(ch);
    }


//    private String longestSubStringWithKDistinctCharacterUniDirectional(String input, int k) {
//        int totalInputLength = input.length();
//        currentWindowCharacters = new HashMap<Character, Integer>(k);
//        lList = new LinkedList<Character>();
//        int currentCount=0;
//        char last = input.charAt(0);
//        lList.add(input.charAt(0));
//        for(int i = 0; i<totalInputLength; i++){
//            char ch = input.charAt(i);
//            if(currentCount<k && !currentWindowCharacters.containsKey(ch)){
//                addToQueue(ch);
//                currentCount++;
//            }else if(!currentWindowCharacters.containsKey(ch)){
//                popResetAdd(ch);
//            }
//            currentWindowCharacters.put(ch, ++currentMax);
//            builder.append(ch);
//            if(ch != last) {
//                lList.removeFirst();
//                lList.add(ch);
//                last = ch;
//            }
//        }
//        popResetAdd(' ');
//        return maxSubstring;
//    }
//
//    private void popResetAdd(Character ch) {
//        char last =  lList.getFirst().charValue();
//        String temp = builder.toString();
//        System.out.println("Temp: " + temp);
//        if(temp.length() > maxSubstringLength){
//            maxSubstringLength = temp.length();
//            maxSubstring = temp;
//        }
//        int index = currentWindowCharacters.get(last);
//        builder.delete(0,index);
//        currentMax -=index;
//        System.out.println("AfterDelete: "+builder.toString()+ "tempLength: " + currentMax);
//        currentWindowCharacters.remove(last);
//    }
//
//    private void addToQueue(Character e) {
//        lList.add(e);
//    }


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
