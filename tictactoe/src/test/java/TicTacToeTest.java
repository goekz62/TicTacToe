import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void testSwitchCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        game.switchCurrentPlayer();
        assertEquals('O', game.getCurrentPlayer().getMarker());
    }
}
