import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by jpramos on 3/6/14.
 */
public class HumanPlayerTests {

    HumanPlayer playerOne;
    Board testBoard;

    @Before
    public void setUp() {
        playerOne = new HumanPlayer(1);
        testBoard = mock(Board.class);
    }

    @Test
    public void playerShouldCallMakeMove() {

        playerOne.makeMove(testBoard, "1");

        verify(testBoard, times(1)).fillBoard(1, "1");
    }

    @Test
    public void shouldAlertOfOccupiedSpace(){



    }
}
