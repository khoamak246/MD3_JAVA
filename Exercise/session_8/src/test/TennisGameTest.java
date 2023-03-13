package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tennisGame.TennisGame.getScore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TennisGameTest {
    String player1Name = "Hello";
    String player2Name = "Hi";

    @ParameterizedTest
    @CsvSource(
            {
                    "0, 0, Love-All",
                    "1, 1, Fifteen-All",
                    "2, 2, Thirty-All",
                    "3, 3, Forty-All",
                    "4, 4, Deuce",
                    "1, 0, Fifteen-Love",
                    "0, 1, Love-Fifteen",
                    "2, 0, Thirty-Love",
                    "0, 2, Love-Thirty",
                    "3, 0, Forty-Love",
                    "0, 3, Love-Forty",
                    "4, 0, Win for Hello",
                    "0, 4, Win for Hi",

                    "2, 1, Thirty-Fifteen",
                    "1, 2, Fifteen-Thirty",
                    "3, 1, Forty-Fifteen",
                    "1, 3, Fifteen-Forty",
                    "4, 1, Win for Hello",
                    "1, 4, Win for Hi",

                    "3, 2, Forty-Thirty",
                    "2, 3, Thirty-Forty",
                    "4, 2, Win for Hello",
                    "2, 4, Win for Hi",

                    "4, 3, Advantage Hello",
                    "3, 4, Advantage Hi",
                    "5, 4, Advantage Hello",
                    "4, 5, Advantage Hi",
                    "15, 14, Advantage Hello",
                    "14, 15, Advantage Hi",

                    "6, 4, Win for Hello",
                    "4, 6, Win for Hi",
                    "16, 14, Win for Hello",
                    "14, 16, Win for Hi",
            }
    )
    void testTennisGameScore0And0(int player1Score, int player2Score, String expected) {
        String result = getScore(player1Name, player2Name, player1Score, player2Score);
        assertEquals(expected, result);
    }

}
