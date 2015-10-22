import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Engine {
    public static HashMap<Integer, Player> playerMap = new HashMap<>();
    public static ArrayList<PlayingCard> deck = new ArrayList<>(DeckOfCards.getDeckOfCards());
    public static ArrayList<Player> voteList = new ArrayList<>(VoteSystem.initVoteboard());
    public static ArrayList<Player> scoreBoard = new ArrayList<>(Scoreboard.initScoreboard());
    static Scanner keyboard = new Scanner(System.in);

    public static void startGame(){

    }
    public static void playerSetup(int numOfPlayers) {
        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.printf("Enter your name, player %d: ", i);
            String playerName = keyboard.nextLine();
            playerMap.put(i, new Player(playerName));
            scoreBoard.add(playerMap.get(i));
        }
    }
}
