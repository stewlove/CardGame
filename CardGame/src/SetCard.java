/*
 * Stewart Lovell
 * SetCard.java
 * 4/27/2022
 */

/**
 * SetCard class, extends card, creates set card objects and interacts with them
 */
public class SetCard extends Card {

    private String shape;
    private int number;
    private String shading;
    private String color;

    /**
     * Default constructor for the SetCard class
     */
    public SetCard() {}

    /**
     * Parameterized constructor for the SetCard class
     * @param givenShape The shape of the set card
     * @param givenNumber The number of shapes on the set card
     * @param givenShading The shading of shapes on the set card
     * @param givenColor The color of shapes on the set card
     */
    public SetCard(String givenShape, int givenNumber, String givenShading, String givenColor) {
        super(givenShading + "-" + givenColor + " " + givenShape + " " + givenNumber);
        this.shape = givenShape;
        this.number = givenNumber;
        this.shading = givenShading;
        this.color = givenColor;
    }

    /**
     * @return shape of the card
     */
    public String getShape() {
        return shape;
    }

    /**
     * @return number of the card
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return shading of the card
     */
    public String getShading() {
        return shading;
    }

    /**
     * @return color of the card
     */
    public String getColor() {
        return color;
    }

    /**
     * @return description of the card
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
