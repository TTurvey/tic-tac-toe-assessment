import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeShould {

    @Test
    void
    prevent_O_from_playing_first() {
        TicTacToe ticTacToe = new TicTacToe();

        assertFalse( ticTacToe.play("O") );
    }

    @Test
    void
    allow_X_to_play_first() {
        TicTacToe ticTacToe = new TicTacToe();

        assertTrue( ticTacToe.play("X") );
    }

    @Test
    void
    allow_X_and_then_O() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X");

        assertTrue( ticTacToe.play("O") );
    }

    @Test
    void
    allow_X_and_then_O_and_then_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X");
        ticTacToe.play("O");

        assertTrue( ticTacToe.play("X") );
    }

    @Test
    void
    allow_X_and_then_O_and_then_prevent_O() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X");
        ticTacToe.play("O");

        assertFalse( ticTacToe.play("O") );
    }

    @Test
    void
    allow_X_and_then_prevent_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X");

        assertFalse( ticTacToe.play("X") );
    }




}
