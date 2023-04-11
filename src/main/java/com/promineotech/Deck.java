package com.promineotech;

/**
 * Represents a collection of cards.
 */
public class Deck {
  /**
   * Creates an instance of the Deck class.
   */
  public Deck() {
    // TODO Initialize standard 52 card deck.
  }
  
  /**
   * Creates an instance of the Deck class.
   * @param cards The list of cards to initialize or create the deck with.
   */
  public Deck(Card[] cards) {
    // TODO Put cards in deck.
  }

  /**
   * Shuffles the cards putting them in a random order.
   */
  public void shuffle() {
    // TODO Randomize cards in deck.
  }
  
  /**
   * Draws a card from the deck.
   * @return The card that was draw if valid. If no cards, then null is returned.
   */
  public Card draw() {
    // TODO Remove / return first card from deck.
    throw new UnsupportedOperationException("Not implemented");
  }
}
