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
    private HumanPlayer playerOne;
    private HumanPlayer playerTwo;

    @Before
    public void setUp(){
        stream = mock(PrintStream.class);
        board = new Board(stream);
        playerOne = mock(HumanPlayer.class);
        playerTwo = mock(HumanPlayer.class);
    }

    @Test
    public void shouldPrintBoard(){
        board.printBoard();
        verify(stream, times(3)).println();

    }


    @Test
    public void shouldAlertThatSpaceIsOccupiedLocation() throws IOException{
        BufferedReader playerOneInput = mock(BufferedReader.class);
        when(playerOneInput.readLine()).thenReturn("1").thenReturn(null);

        playerOne.makeMove(board, stream.toString());

        BufferedReader playerTwoInput = mock(BufferedReader.class);
        when(playerTwoInput.readLine()).thenReturn("1").thenReturn(null);

        playerTwo.makeMove(board, stream.toString());

        verify(stream).println("This Space is Occupied! Select Another");
    }
}