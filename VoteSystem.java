package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class VoteSystem {

    public static ArrayList<Player> initVoteboard() {
        ArrayList<Player> listOfPlayerCombos = new ArrayList<Player>();

        return listOfPlayerCombos;
    }

    public static void showCandidates (){
        Collections.shuffle(Engine.voteCandidates);
        for (int i = 0; i < Engine.voteCandidates; i++){
            System.out.print((i+1) + ": " + Engine.voteCandidates(i) + ".");
        }
    }

    public static void layVote (int numOfPlayers){
        for (int i = 1; i <= numOfPlayers;)
        System.out.printf("Player %d, which alternative reigns supreme?", i);

    }



}
