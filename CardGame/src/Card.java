/*
 * Stewart Lovell
 * Card.java
 * 4/27/2022
 */

/**
 * Card class that creates card objects and interacts with them
 */
public class Card {
    private String cardText;

    /**
     * Default constructor for the card class
     */
    public Card(){}

    /**
     * Parameterized constructor for the card class
     * @param card description of card created
     */
    public Card(String card) {
        this.cardText = card;
    }

    /**
     * @return description of the card
     */
    public String getCardText() {
        return cardText;
    }

    /**
     * @return description of the card
     */
    public String toString() {
        return cardText;
    }
}
