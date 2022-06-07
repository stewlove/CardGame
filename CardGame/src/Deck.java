/*
 * Stewart Lovell
 * Deck.java
 * 4/27/2022
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * Deck class that creates deck objects
 */
public class Deck {

    private ArrayList<Card> dealerPile;
    private ArrayList<Card> discardPile;

    /**
     * Default constructor for the deck class
     */
    public Deck(){
        dealerPile = new ArrayList<Card>();
        discardPile = new ArrayList<Card>();
    }

    /**
     * Parameterized constructor for the deck class
     * @param card Card object from the card class
     */
    public void addCard(Card card) {
        // take the given card and add it to the dealerPile
        dealerPile.add(card);
    }

    /**
     * Move all cards from the discard pile into the dealer pile, then shuffle the dealer pile
     */
    public void shuffle() {
        // loop through discard pile, adding each card to dealer pile
        for (int i = 0; i < discardPile.size(); i++) {
            dealerPile.add(discardPile.get(i));
        }

        // shuffle the dealerPile
        Collections.shuffle(dealerPile);

        // clear the discard pile, removing all cards from it
        discardPile.clear();
    }

    /**
     * Method that 'deals' the top card in the dealer pile, removing it and adding it to the discard pile
     * @return the dealt card
     */
    public Card dealTopCard() throws IndexOutOfBoundsException {

        // store the card being removed
        Card removedCard = dealerPile.get(0);

        // remove the card from the dealerPile
        dealerPile.remove(0);

        // add the card to the discardPile
        discardPile.add(removedCard);

        // return the removed card
        return removedCard;
    }

    /**
     * @return The number of cards left in the dealerPile
     */
    public int cardCount() {
        return dealerPile.size();
    }

    public String toString() {
        // create a variable that will hold the string for the dealer deck
        String dealerDeck = "";

        // loop through the dealer deck, concatenate onto the string for each card in the deck
        for (int i = 0; i < dealerPile.size()-1; i++) {
            dealerDeck += dealerPile.get(i).toString() + "\n";
        }

        // same concept for the discard deck
        String discardDeck = "";
        for (int i = 0; i < discardPile.size()-1; i++) {
            dealerDeck += discardPile.get(i).toString() + "\n";
        }

        // return the created string
        return cardCount() + " cards in deck \n" +
                "***************** \n" +
                dealerDeck + "\n" +
                discardPile.size() + " cards in discard \n" +
                "***************** \n" +
                discardDeck;
    }
}
