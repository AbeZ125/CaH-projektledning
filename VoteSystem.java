import java.util.ArrayList;
import java.util.Collections;

public class VoteSystem {

    public static ArrayList<Player> initVoteboard() {
        ArrayList<Player> listOfPlayerCombos = new ArrayList<Player>();

        return listOfPlayerCombos;
    }

    public static void showCandidates (){
        Collections.shuffle(Engine.voteList);
        for (int i = 0; i < Engine.voteList.size(); i++){
            System.out.print((i+1) + ": " + Engine.voteList.get(i) + ".");
        }
    }

    public static void layVote (int numOfPlayers){
        for (int i = 1; i <= numOfPlayers;i++)
        System.out.printf(Engine.playerMap.get(i).getName() +", which alternative reigns supreme?", i);

    }



}
