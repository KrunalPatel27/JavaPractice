package com.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class rand {

    public rand(){
        List<Character> inputList =  new ArrayList<Character>();
//        inputList.add('a');
//        inputList.add('b');
//        inputList.add('c');
//        inputList.add('d');
//        inputList.add('e');
//        inputList.add('h');

        System.out.println(lengthEachScene(inputList));
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<Integer> lengthEachScene(List<Character> inputList)
    {
        List<Integer> foundScenes = new ArrayList<Integer>();

        if(inputList.size() == 0){
            return foundScenes;
        }
        // tracks the order in which new char are discovered. to avoid sorting later
        List<Character> orderedChar = new ArrayList<Character>();

        HashMap<Character, Integer[]> map = new HashMap<Character, Integer[]>();
        int length = inputList.size();

        //loop thro to find edges for each char
        for(int i=0; i<length; i++){
            Character input = inputList.get(i);
            if(map.containsKey(input)){
                Integer[] temp = map.get(input);
                temp[1] = i;
                map.put(input, temp);
            }else{
                Integer[] temp = new Integer[2];
                temp[0] = i;
                temp[1] = i;
                map.put(input, temp);
                orderedChar.add(input);
            }
        }


        int foundChars = orderedChar.size();
        Character currChar = orderedChar.get(0);
        Character nextChar;
        int windowCount = 0;
        int windowEnd = map.get(currChar)[1];
        int lastMax =0;

        if(foundChars ==1) {
            foundScenes.add(map.get(currChar)[1] + 1 );
            return foundScenes;

        }
        for(int i=1; i<foundChars; i++){
            nextChar = orderedChar.get(i);

            if(map.get(nextChar)[0] <= windowEnd){
                windowEnd = Math.max(windowEnd, map.get(nextChar)[1]);
            }else{
                foundScenes.add(windowEnd - lastMax +1);
                lastMax = windowEnd + 1;
                windowEnd = map.get(nextChar)[1];
            }

        }
        foundScenes.add(windowEnd - lastMax +1);



        return foundScenes;
    }
}
