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

            case 3:
                BFS_rottingOranges bfs_rottingOranges = new BFS_rottingOranges();
                break;

            case 4:
                Top_K_Words top_k_words = new Top_K_Words();

            case 5:
                rand bfs_serverFarm = new rand();

            default:
               break;
        }
    }
}
