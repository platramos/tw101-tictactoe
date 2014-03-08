import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by jpramos on 3/6/14.
 */

public class BoardTest {

    private Board board;
    private PrintStream stream;

    @Before
    public void setUp(){
        stream = mock(PrintStream.class);
        board = new Board(stream);
    }

    @Test
    public void shouldPrintBoard(){
        board.printBoard();
        verify(stream, times(3)).println();

    }
}