import java.util.ArrayList;

//Dealer needs to deal cards
//Dealer needs to be able to hit
//Kinda wanted hit to be like "If Dealer hand < 17, addCard"

/**
 * Work in progress
 */

public class Dealer extends Player {

    private Player name; // Whom the dealer will play against
    private Deck deck; // This will be the dealers deck
    //private ArrayList<Card> hand; //Dealers hand?
    private final Card hand;

    private Dealer(Card hand, Deck deck){
        this.hand = hand;
        this.deck = deck;

    }


    public Card hit() {

        System.out.println("The dealer will now hit");
        Card c = dealNext();
    }

    public Card dealNext(Card){

        Card  d =
        return d;
    }

    //If the deck ever gets empty, this will create a new one
    public synchronized void deckNew(){

        if(deck.empty())
        deck = dec
    }

}