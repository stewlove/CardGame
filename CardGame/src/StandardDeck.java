/*
 * Stewart Lovell
 * StandardDeck.java
 * 4/27/2022
 */

/**
 * StandardDeck class, extends deck, creates a standard deck object
 */
public class StandardDeck extends Deck {

    StandardDeck() {
        super();

        // loop through each suit, creating all numbered rank cards and adding them to dealerPile
        for (int i = 2; i < 11; i++) {
            super.addCard(new StandardCard(""+ i, "Hearts"));
        }
        for (int i = 2; i < 11; i++) {
            super.addCard(new StandardCard(""+ i, "Diamonds"));
        }
        for (int i = 2; i < 11; i++) {
            super.addCard(new StandardCard(""+ i, "Spades"));
        }
        for (int i = 2; i < 11; i++) {
            super.addCard(new StandardCard(""+ i, "Clubs"));
        }

        //Same concept for the face cards
        super.addCard(new StandardCard("Jack", "Hearts"));
        super.addCard(new StandardCard("Jack", "Diamonds"));
        super.addCard(new StandardCard("Jack", "Spades"));
        super.addCard(new StandardCard("Jack", "Clubs"));

        super.addCard(new StandardCard("Queen", "Hearts"));
        super.addCard(new StandardCard("Queen", "Diamonds"));
        super.addCard(new StandardCard("Queen", "Spades"));
        super.addCard(new StandardCard("Queen", "Clubs"));

        super.addCard(new StandardCard("King", "Hearts"));
        super.addCard(new StandardCard("King", "Diamonds"));
        super.addCard(new StandardCard("King", "Spades"));
        super.addCard(new StandardCard("King", "Clubs"));

        super.addCard(new StandardCard("Ace", "Hearts"));
        super.addCard(new StandardCard("Ace", "Diamonds"));
        super.addCard(new StandardCard("Ace", "Spades"));
        super.addCard(new StandardCard("Ace", "Clubs"));
    }

    /**
     *
     * @return Returns the card to be cast as type StandardCard
     */
    public StandardCard dealTopCard() { return (StandardCard) super.dealTopCard(); }
}
