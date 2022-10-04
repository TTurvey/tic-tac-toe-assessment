public class TicTacToe {

    private int turnNumber = 1;
    private String[][] board = {
            {".", ".", "."},
            {".", ".", "."},
            {".", ".", "."}
    };

    public boolean play(String symbol, int x, int y) {

        if (symbol.equals("X") && turnNumber % 2 == 1 && board[y][x].equals(".")) {
            board[y][x] = symbol;
            turnNumber++;
            return true;
        }

        if (symbol.equals("O") && turnNumber % 2 == 0 && board[y][x].equals(".")) {
            board[y][x] = symbol;
            turnNumber++;
            return true;
        }

        return false;
    }
}
