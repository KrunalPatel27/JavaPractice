package com.amazon;

import java.util.*;

public class Top_K_Words {

    public Top_K_Words(){
        String[] a = new String[]{"love", "lovedss"};
        System.out.println(a[0].compareTo(a[1]));
        List<Integer> b = new ArrayList<Integer>();
        b.add(2); b.add(4); b.add(2); b.add(1); b.add(9); b.add(11);
        Collections.sort(b, (v1, v2) -> v1.equals(v2) ? v1: v1-v2);

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

//        Collections.sort(b, (c,d) -> c.equals(d) ? 0: c - d);
        System.out.println(b);
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int length = words.length;
        for(int i = 0; i<length; i++){
            map.put(words[i], map.getOrDefault(words[i], 0) +1 );
        }

        List<String> list =  new ArrayList(map.keySet());

        /*
        Comparator, returns negative if 1st obj is less than 2nd
                    returns zero if 1st is equal to 2nd
                    returns positive if 1st obj is greater than 2nd
         */
        Collections.sort(list, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));


        return list.subList(0, k);
    }
}
