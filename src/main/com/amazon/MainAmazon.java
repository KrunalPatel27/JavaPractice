package com.amazon;

public class MainAmazon {

    public static void main (String[] args){
        switch (Integer.parseInt(args[0])){
            case 1:
                MoviesOnFlight moviesOnFlight = new MoviesOnFlight();
                break;

            case 2:
                NmostPopularToys nmostPopularToys = new NmostPopularToys();
                break;
            default:
               break;
        }
    }
}
