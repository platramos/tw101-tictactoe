import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpramos on 3/6/14.
 */

public class HumanPlayer {

    private int playerNumber;
    private String mark;

    public HumanPlayer(int number, String mark){
        this.playerNumber = number;
        this.mark = mark;
    }

    public void makeMove(Board board, String userCommand) {

            board.fillBoard(userCommand, mark);

    }

    public int playerNumber() {
        return playerNumber;
    }
}
