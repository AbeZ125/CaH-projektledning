package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Scoreboard {

    public static ArrayList<Player> initScoreboard() {
        ArrayList<Player> PlayerScoreboard = new ArrayList<Player>();

        return PlayerScoreboard;
    }

    public static void sortScoreboard() {
        Collections.sort(Engine.scoreBoard, ComparePlayer.scoreComparator);
    }

    public static void showScoreboard() {
        System.out.println("  ** SCOREBOARD **");
        System.out.println("--------------------");
        for (int i = 0; i < Engine.scoreBoard.size(); i++) {
            System.out.println((i+1)+ " | "  + Engine.scoreBoard.get(i).getName() + " with " +
                    Engine.scoreBoard.get(i).getPoints() + " points.");
        }
        System.out.println("--------------------");
    }

    public static void clearScoreboard(){
        Engine.scoreBoard.clear();
    }

    public static void isLeader() {
        System.out.println(Engine.scoreBoard.get(0).getName() + " is in the lead!\n");
    }
}
