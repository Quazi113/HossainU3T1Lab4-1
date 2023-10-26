public class Player {


    private String name;
    private int score;
    private int winningStreak;


    public Player(String name) {
        this.name = name;
        score = 0;
        winningStreak = 0;
    }


    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }


    public void incrementScore() {
        score++;
    }


    public void reset() {
        score = 0;
    }


    public void resetStreak() {
        winningStreak = 0;
    }
    public void incrementStreak() {
        winningStreak = winningStreak + 1;
    }

    public String winningStreak() {
        return winningStreak + "";
    }
}
