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



}
