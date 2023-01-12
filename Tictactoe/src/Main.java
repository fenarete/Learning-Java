public class Main {
    public static void main(String[] args) {

        var headsOrTails = new HeadsOrTails();
        String whoStarts = headsOrTails.flipCoin();

        if (whoStarts.equals("I win")) {
            System.out.println("I start");
            Board.setMark();
        }
        else System.out.println("You start");
        while (Board.status.equals("Still playing")){
            Board.graph();
            Board.checkStatus();
            Board.getMark();
            Board.think();
            Board.setMark();
        }
    }
}