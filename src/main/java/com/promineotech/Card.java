package com.promineotech;

/**
 * Represents a standard playing card.
 */
public class Card {
  private Suit suit;
  private String face;
  
  /**
   * Creates an instance of the Card class.
   * @param suit The suit for the card (diamond, spade, heart, club).
   * @param face The face value for the card. (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
   */
  public Card(Suit suit, String face) {
    this.suit = suit;
    this.face = face;
  }

  /**
   * Gets the face value for the card.
   * @return The face value.
   */
  public String getFace() {
    return face;  
  }
  
  /**
   * Gets the suite for the card
   * @return The suit for the card.
   */
  public Suit getSuit() {
    return suit;
  }
  
  /**
   * Retrieves the numeric value of the card.
   * @return The numeric value.
   */
  public int getValue() {
    // A, J, Q, K => Get corresponding value
    if ("A".equalsIgnoreCase(getFace())) {
      return 14;
    }
    if ("K".equalsIgnoreCase(getFace())) {
      return 13;
    }
    if ("Q".equalsIgnoreCase(getFace())) {
      return 12;
    }
    if ("J".equalsIgnoreCase(getFace())) {
      return 11;
    }
    
    // 2 - 10 => Convert String to Int
    try {
      return Integer.parseInt(getFace());
    }
    catch (NumberFormatException e) {
      // This code should never get here...
      return 0;
    }
  }
  
  /**
   * Returns the detailed description of the card.
   * @return The description.
   */
  public String describe() {
    // 2 - 10, J, Q, K, A
    StringBuilder output = new StringBuilder();
    if ("A".equalsIgnoreCase(getFace())) {
      output.append("Ace");
    }
    else if ("K".equalsIgnoreCase(getFace())) {
      output.append("King");
    }
    else if ("Q".equalsIgnoreCase(getFace())) {
      output.append("Queen");
    }
    else if ("J".equalsIgnoreCase(getFace())) {
      output.append("Jack");
    }
    else if ("10".equalsIgnoreCase(getFace())) {
      output.append("Ten");
    }
    else if ("9".equalsIgnoreCase(getFace())) {
      output.append("Nine");
    }
    else if ("8".equalsIgnoreCase(getFace())) {
      output.append("Eight");
    }
    else if ("7".equalsIgnoreCase(getFace())) {
      output.append("Seven");
    }
    else if ("6".equalsIgnoreCase(getFace())) {
      output.append("Six");
    }
    else if ("5".equalsIgnoreCase(getFace())) {
      output.append("Five");
    }
    else if ("4".equalsIgnoreCase(getFace())) {
      output.append("Four");
    }
    else if ("3".equalsIgnoreCase(getFace())) {
      output.append("Three");
    }
    else if ("2".equalsIgnoreCase(getFace())) {
      output.append("Two");
    }
    output.append(" of ");
    
    switch(getSuit()) {
      case HEART:
        output.append("Hearts");
        break;
      case CLUB:
        output.append("Clubs");
        break;
      case SPADE:
        output.append("Spades");
        break;
      case DIAMOND:
        output.append("Diamonds");
        break;
    }
    return output.toString();
  }
  
  /**
   * Returns the default string representation of the card.
   * @return The string representation.
   */
  @Override
  public String toString() {
    return String.format("%s%s", getSuit(), getFace());
  }
}
