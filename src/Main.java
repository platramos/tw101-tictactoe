import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by jpramos on 3/6/14.
 */



public class Main {

    public static void main(String[] args) {
        Board board = new Board(System.out);
        HumanPlayer playerOne = new HumanPlayer(1);
        HumanPlayer playerTwo = new HumanPlayer(2);

        InputStreamReader inputData = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputData);


        String playerOneCommand = playerOne.takeUserInput(bufferedReader);
        playerOne.makeMove(board, playerOneCommand);

        String playerTwoCommand = playerOne.takeUserInput(bufferedReader);
        playerTwo.makeMove(board, playerTwoCommand);

        board.printBoard();
    }

}
