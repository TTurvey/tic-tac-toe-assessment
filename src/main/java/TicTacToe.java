public class TicTacToe {

    private int turnNumber = 1;

    public boolean play(String symbol) {

        if (symbol.equals("X")) {
            turnNumber++;
            return true;
        }
        if (symbol.equals("O") && turnNumber > 1) {
            turnNumber++;
            return true;
        }
        return false;
    }
}
