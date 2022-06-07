/*
 * Stewart Lovell
 * StandardCard.java
 * 4/27/2022
 */

/**
 * StandardCard class, extends card, creates standard card objects and interacts with them
 */
public class StandardCard extends Card {

    private String rank;
    private String suit;

    /**
     * Default constructor for the StandardCard class
     */
    public StandardCard(){}

    /**
     * Parameterized constructor for the StandardCard class
     * @param givenRank The rank of the standard card
     * @param givenSuit The suit of the standard card
     */
    public StandardCard(String givenRank, String givenSuit) {
        super(givenRank + " of " + givenSuit);
        this.rank = givenRank;
        this.suit = givenSuit;
    }

    /**
     * @return rank of the card
     */
    public String getRank() {
        return rank;
    }

    /**
     * @return suit of the card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @return description of the card
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
