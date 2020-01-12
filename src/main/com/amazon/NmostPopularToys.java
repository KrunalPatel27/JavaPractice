package com.amazon;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class NmostPopularToys {
    /**
     * You have an array of quotes, an array of toy names,
     * and you want to find top N most popular toys by how many quotes they're mentioned in
     */
    List<String> toys;
    List<String> quotes;
    public NmostPopularToys(){
        setup();
        findNPopularToys(toys, quotes, 3);
    }

    private void findNPopularToys(List<String> toys, List<String> quotes, int i) {

        Set<String> toySet = new HashSet<>();
        Map<String, Integer> toyMap = new HashMap<>();
        for (String toy:toys) {

            toySet.add(toy.toLowerCase());
        }

        //count toy words in quotes
        for(String quote: quotes){
            String[] words = quote.toLowerCase().split(" ");
            for (String word: words){
                if(toySet.contains(word)){
                    if(toyMap.containsKey(word)){
                        toyMap.put(word, toyMap.get(word)+1);
                    }
                    else{
                        toyMap.put(word, 1);
                    }
                }
            }
        }
        // counting done

        List<String> a = toyMap.entrySet()
                        .stream()
                        .sorted(comparingByValue())
                        .map(e->e.getKey())
                        .collect(Collectors.toList());

        for (String s: a){
            System.out.println(s);
        }
    }


    private void setup() {
        toys = new ArrayList<>();
        quotes = new ArrayList<>();

        toys.add("ball"); //5
        toys.add("crayon"); //2
        toys.add("bear"); //4
        toys.add("iphone");

        quotes.add("hello ball");
        quotes.add("hi ball");
        quotes.add("ball ball");
        quotes.add("bear ball");

        quotes.add("bear hunt");
        quotes.add("bear likes honey ball");

        quotes.add("Crayon used to draw bear");
        quotes.add("Crayon are expensive");
    }

}
class stats implements Comparator{
    String word;
    int count;
    int quotesCount;
    public stats(String word){
        this.word = word;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
