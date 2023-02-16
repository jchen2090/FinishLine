public class FinishLine {

    public static void main(String[] args) {
        boolean gameIsOver = false;
        Board gameBoard = new Board();
        Player player1 = new Player();
        Player player2 = new Player();
        Dice die1 = new Dice();
        Dice die2 = new Dice();


        while (!gameBoard.isFull()) {
            if (player1.isTurn()) {
                int d1Value = die1.rollDie();
                int d2Value = die1.rollDie();

                if ((d1Value == player1.getPosition() + 1 || d2Value == player1.getPosition() + 1) || (d1Value + d2Value == player1.getPosition() + 1)) {
                    gameBoard.setPosition(player1.getPosition());
                    player1.setPosition(player1.getPosition() + 1);
                }
            }
            else if (player2.isTurn()) {
                int d1Value = die1.rollDie();
                int d2Value = die1.rollDie();

                if ((d1Value == player2.getPosition() + 1 || d2Value == player2.getPosition() + 1) || (d1Value + d2Value == player2.getPosition() + 1)) {
                    player1.setPosition(player1.getPosition());
                    gameBoard.setPosition(player2.getPosition());
                }
            }
            System.out.println(gameBoard);
        }
    }
}
