public class Main {
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 10000;
        int lvlComplete = 8;
        int bonus = 200;
        int highScore = calculateScore(gameOver, score, lvlComplete, bonus);

        System.out.println("Your Final Score was " + highScore);

        System.out.println("Score set to " + score);
        System.out.println("level completed set to " + lvlComplete);
        System.out.println("Bonus set to " + bonus);

        calculateScore(gameOver, score, lvlComplete, bonus);


    int highScorePosition = calculatedHighScore(1500);
    displayHighScorePosition("Nick", highScorePosition);

    highScorePosition = calculatedHighScore(900);
    displayHighScorePosition("Jim", highScorePosition);

    highScorePosition = calculatedHighScore(50);
    displayHighScorePosition("Ryker", highScorePosition);

    }
    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (lvlCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition )
    {
        System.out.println(playerName + " Managed To Get " + highScorePosition + " position");
    }
    public static int calculatedHighScore(int playerScore)
    {
        if(playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500)
        {
            return 2;
        }
        else if (playerScore >= 100)
        {
            return  3;
        }
        else
        {
            return 4;
        }
    }
}