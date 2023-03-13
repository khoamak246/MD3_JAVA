package tennisGame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score;
        boolean isEqual = player1Score == player2Score;
        boolean isPlayer1ScoreAbove4 = player1Score >= 4;
        boolean isPlayer2ScoreAbove4 = player2Score >= 4;

        if (isEqual) {
            score = getEqualScore(player1Score);
        } else {
            if (isPlayer1ScoreAbove4 || isPlayer2ScoreAbove4) {
                score = getWinnerPlayer(player1Name, player2Name, player1Score, player2Score);
            } else {
                StringBuilder scoreBuilder = getScoreBuilder(player1Score, player2Score);
                score = scoreBuilder.toString();
            }
        }
        return score;
    }

    private static StringBuilder getScoreBuilder(int player1Score, int player2Score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder();
        for (int i = 1; i < 3; i++) {

            if (i == 1)
                tempScore = player1Score;
            else {
                scoreBuilder.append("-");
                tempScore = player2Score;
            }

            switch (tempScore) {
                case 0 -> scoreBuilder.append("Love");
                case 1 -> scoreBuilder.append("Fifteen");
                case 2 -> scoreBuilder.append("Thirty");
                case 3 -> scoreBuilder.append("Forty");
            }
        }
        return scoreBuilder;
    }

    private static String getWinnerPlayer(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score;
        int scoreGap = player1Score - player2Score;
        if (scoreGap == 1)
            score = "Advantage " + player1Name;
        else if (scoreGap == -1)
            score = "Advantage " + player2Name;
        else if (scoreGap >= 2)
            score = "Win for " + player1Name;
        else
            score = "Win for " + player2Name;
        return score;
    }

    private static String getEqualScore(int player1Score) {
        String score;
        score = switch (player1Score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
        return score;
    }

}

