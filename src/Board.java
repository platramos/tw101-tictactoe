import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpramos on 3/6/14.
 */

public class Board {

    private final PrintStream out;
    private String[][] board = new String[3][3];

    public Board(PrintStream out) {

        this.out = out;
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
               board[row][column] = "";

            }
        }
    }

    public void printBoard() {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                out.print("----");
                out.print( board[row][column] );
                if (column != board.length - 1) {
                    out.print("|");
                }
            }
            out.println();
        }
    }
    public void fillBoard(int playerNumber, String userCommand){

        if (playerNumber == 1) {
            if (userCommand.equals("1")) {
                board[0][0] += "X";
            }
        }
        if (playerNumber == 2){
            board[0][1] += "O";
        }
    }
}
