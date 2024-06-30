import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void testIsCellEmpty() {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    public void testPlace() {
        Board board = new Board();
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlaceInvalid() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(0, 0, 'O'); // should throw exception
    }
}
