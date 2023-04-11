package com.promineotech.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import com.promineotech.Card;
import com.promineotech.Suit;

class CardTests {
  @Test
  void constructor_ShouldTakeASuitAndFace() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_ShouldThrowErrorIfNoParametersProvided() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_ShouldThrowErrorIfSuitIsNotValid() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_ShouldThrowErrorIfFaceIsNotValid() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void toString_WithKingHeartShouldReturnSuitSymbolAndFace() {
    // Arrange
    String expected = "♥K";
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void describe_WithAceSPADEShouldReturnAceOfSpades() {
    // Arrange
    String expected = "Ace of Spades";
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void getValue_With2CLUBShouldReturn2() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void getValue_WithAceSPADEShouldReturn14() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void getValue_WithQueenHEARTShouldReturn12() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  // ----------------------- [ IGNORE BELOW HERE ] -----------------------
  
  //@ParameterizedTest
  @MethodSource("getCardValues")
  void getValue_ReturnsExpectedValue(Suit suit, String face, int expectedValue) {
    // Arrange
    Card card = new Card(suit, face);
    
    // Act/Invoke
    int value = card.getValue();
    
    // Assert
    assertThat(value).isEqualTo(expectedValue);
  }

  //@ParameterizedTest
  @MethodSource("getCardDescriptions")
  void describe_ReturnsExpectedValue(Suit suit, String face, String expectedDescription) {
    // Arrange
    Card card = new Card(suit, face);
    
    // Act/Invoke
    String value = card.toString();
    
    // Assert
    assertThat(value).isEqualTo(expectedDescription);
  }
  
  //@ParameterizedTest
  @MethodSource("getCardStrings")
  void toString_ReturnsExpectedValue(Suit suit, String face, String expectedStringValue) {
    // Arrange
    Card card = new Card(suit, face);
    
    // Act/Invoke
    String value = card.toString();
    
    // Assert
    assertThat(value).isEqualTo(expectedStringValue);
  }  
  
  // ----------------------- [ HELPER METHODS ] -----------------------

  /**
   * Test parameter generator for card and expected values.
   * @return Stream of test parameters.
   */
  private static Stream<Arguments> getCardValues() {
    return Stream.of(
      Arguments.of(Suit.CLUB, "A", 14),
      Arguments.of(Suit.SPADE, "K", 13),
      Arguments.of(Suit.SPADE, "Q", 12),
      Arguments.of(Suit.SPADE, "J", 11),
      Arguments.of(Suit.SPADE, "10", 10),
      Arguments.of(Suit.DIAMOND, "9", 9),
      Arguments.of(Suit.HEART, "8", 8),
      Arguments.of(Suit.CLUB, "7", 7),
      Arguments.of(Suit.CLUB, "6", 6),
      Arguments.of(Suit.CLUB, "5", 5),
      Arguments.of(Suit.DIAMOND, "4", 4),
      Arguments.of(Suit.HEART, "3", 3),
      Arguments.of(Suit.CLUB, "2", 2)
    );
  }

  /**
   * Test parameter generator for card and describe/description values.
   * @return Stream of test parameters.
   */
  private static Stream<Arguments> getCardDescriptions() {
    return Stream.of(
      Arguments.of(Suit.CLUB, "A", "Ace of Clubs"),
      Arguments.of(Suit.SPADE, "K", "King of Spades"),
      Arguments.of(Suit.SPADE, "Q", "Queen of Spades"),
      Arguments.of(Suit.SPADE, "J", "Jack of Spades"),
      Arguments.of(Suit.SPADE, "10", "Ten of Spades"),
      Arguments.of(Suit.DIAMOND, "9", "Nine of Diamonds"),
      Arguments.of(Suit.HEART, "8", "Eight of Hearts"),
      Arguments.of(Suit.CLUB, "7", "Seven of Clubs"),
      Arguments.of(Suit.CLUB, "6", "Six of Clubs"),
      Arguments.of(Suit.CLUB, "5", "Five of Clubs"),
      Arguments.of(Suit.DIAMOND, "4", "Four of Diamonds"),
      Arguments.of(Suit.HEART, "3", "Three of Hearts"),
      Arguments.of(Suit.CLUB, "2", "Two of Clubs")
    );
  }

  /**
   * Test parameter generator for card and describe/description values.
   * @return Stream of test parameters.
   */
  private static Stream<Arguments> getCardStrings() {
    return Stream.of(
      Arguments.of(Suit.CLUB, "A", "♣A"),
      Arguments.of(Suit.SPADE, "K", "♠K"),
      Arguments.of(Suit.SPADE, "Q", "♠Q"),
      Arguments.of(Suit.SPADE, "J", "♠J"),
      Arguments.of(Suit.SPADE, "10", "♠10"),
      Arguments.of(Suit.DIAMOND, "9", "♦9"),
      Arguments.of(Suit.HEART, "8", "♥8"),
      Arguments.of(Suit.CLUB, "7", "♣7"),
      Arguments.of(Suit.CLUB, "6", "♣6"),
      Arguments.of(Suit.CLUB, "5", "♣5"),
      Arguments.of(Suit.DIAMOND, "4", "♦4"),
      Arguments.of(Suit.HEART, "3", "♥3"),
      Arguments.of(Suit.CLUB, "2", "♣2")
    );
  }
}
