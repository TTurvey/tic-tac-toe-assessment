import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeShould {

    @Test
    void
    prevent_O_from_playing_first() {
        TicTacToe ticTacToe = new TicTacToe();

        assertFalse( ticTacToe.play("O", 1, 0) );
    }

    @Test
    void
    allow_X_to_play_first() {
        TicTacToe ticTacToe = new TicTacToe();

        assertTrue( ticTacToe.play("X", 1, 0) );
    }

    @Test
    void
    allow_X_and_then_O() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 1, 0);

        assertTrue( ticTacToe.play("O", 1, 0) );
    }

    @Test
    void
    allow_X_and_then_O_and_then_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 1, 0);
        ticTacToe.play("O", 1, 0);

        assertTrue( ticTacToe.play("X", 1, 0) );
    }

    @Test
    void
    allow_X_and_then_O_and_then_prevent_O() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 1, 0);
        ticTacToe.play("O", 1, 0);

        assertFalse( ticTacToe.play("O", 1, 0) );
    }

    @Test
    void
    allow_X_and_then_prevent_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 1, 0);

        assertFalse( ticTacToe.play("X", 1, 0) );
    }

    @Test
    void
    allow_X_and_then_prevent_X_and_then_allow_O() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 1, 0);

        assertFalse( ticTacToe.play("X", 1, 0) );
        assertTrue( ticTacToe.play("O", 1, 0) );
    }

    @Test
    void
    allow_X_then_O_then_prevent_O_then_allow_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 1, 0);
        ticTacToe.play("O", 1, 0);

        assertFalse( ticTacToe.play("O", 1, 0) );
        assertTrue( ticTacToe.play("X", 1, 0) );
    }

    @Test
    void
    prevent_O_from_playing_on_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play("X", 0, 0);

        assertFalse( ticTacToe.play("O", 0, 0) );
    }



}
