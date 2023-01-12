import java.util.Random;

public class HeadsOrTails {
    public String winner;
    public String flipCoin() {
        Random randomNumber = new Random();
        double coin = randomNumber.nextDouble();
        String whoWin;
        if (coin <= (double) 0.5)
            whoWin = ("You win");
        else
            whoWin = ("I win");
        this.winner = whoWin;
        return this.winner;
    }
}
