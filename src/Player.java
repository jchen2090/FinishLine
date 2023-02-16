public class Player {
    private int position;
    private boolean isTurn;


    public Player() {
        position = 0;
        isTurn = true;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn() {
        isTurn = !isTurn;
    }
}
