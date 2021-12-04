import java.util.ArrayList;
import java.util.List;

/**
 * This will be the players hand. This will help keep track of the player and Dealers hand.
 * I think we'll throw in the bust function here and give the dealer and player their own individual hit
 * Want to try and see if we can make 1 hand visible and the other face down, typically for the player they'll be able
 * to see both their own cards, but should be able to see 1 of the dealers cards
 *
 * Probably gonna come back and change all this up
 */

public class Hand {

    private final List<Card> hand;


    public Hand(List<Card> hand){
        this.hand = hand;
    }

    //This creates a new hand
    public static Hand newHand(){
        return new Hand(new ArrayList<Card>());
    }

    //The first cards that the dealer will give and is turned over by the player
    public Card firstCard(){
        synchronized (hand){
            return hand.get(0);
        }

    }

    /**
     * To show how much the hand is worth
     */
    public int handVal(){
        int value = 0;
        synchronized (hand){
            for(Card v : hand) //true or false
                value += v.aValue();
        }

        return value;
    }

    /**
     * When the player or dealer go over 21, they lose the game.
     * This should clear the hands and start a new game
     * Think this could change, so it affects players and dealer instead of just hand
     */
    public void bust(){
        synchronized (hand){
            hand.clear();
        }
    }

    public static void main(String [] args){

        List<Card> cards = new ArrayList<Card>();
    }



}
