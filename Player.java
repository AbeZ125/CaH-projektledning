import java.util.ArrayList;

public class Player extends Human {
    private int points = 0;
    private ArrayList<PlayingCard> handOfCards = new ArrayList<>();

    public Player(String str) {
        super(str);
    }

    public ArrayList<PlayingCard> getHandOfCards() {
        return handOfCards;
    }

    public void addCard(PlayingCard card) {
        handOfCards.add(card);
    }

    public String toString() { // ALLTID MED (mer eller mindre standard för objekt).
        String playerInfo = getName() + " who has " + points + " points.";
        return playerInfo;
    }

    public void setPoint(int point) {
        points += point;
    }

    public int getPoints() {
        return points;
    }


    public PlayingCard getTopCard() {
        PlayingCard card = handOfCards.get(0);
        return card;
    }

    public void discardHand(){
        handOfCards.clear();
    }
}