public class Board {
    private String[] board;

    public Board() {
        board = new String[10];

        board[0] = "X";

        for (int i = 1; i < board.length; i++) {
            board[i] = "O";
        }
    }

    public String[] getBoard() {
        return board;
    }

    public void setPosition(int pos) {
        board[pos] = "X";
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            if (board[i].equals("O")) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String boardToReturn = "";

        for (int i = 0; i < this.board.length; i++) {
            boardToReturn += " " + this.board[i] + " ";
        }

        return boardToReturn;
    }
}
