package JavaUdemy;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Nick", 400 );
        System.out.println("New Score is " + newScore );
        calculateScore(80);
    }
    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore()
    {
        System.out.println("Unnamed player scored 0 points");
        return 0;
    }
}