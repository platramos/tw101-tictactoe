import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jpramos on 3/6/14.
 */



public class Main {

    public static void main(String[] args) {
        Board board = new Board(System.out);
        HumanPlayer playerOne = new HumanPlayer(1, "X");
        HumanPlayer playerTwo = new HumanPlayer(2, "O");

        InputStreamReader inputData = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputData);

        String playerOneCommand = takeUserInput(bufferedReader, board, playerOne);
        playerOne.makeMove(board, playerOneCommand);

        String playerTwoCommand = takeUserInput(bufferedReader, board, playerTwo);
        playerTwo.makeMove(board, playerTwoCommand);

        board.printBoard();
    }

    public static String takeUserInput(BufferedReader bufferedReader, Board board, HumanPlayer player){
        System.out.println("Make a move Player " + player.playerNumber() + "!");

        String userInput = "";

        try{
            if (board.isSpaceOccupied(userInput)) {
                System.out.println("Location already taken, please choose another");
                bufferedReader.reset();
            }
            userInput = bufferedReader.readLine();

            return userInput;


        } catch (IOException exception){
            return userInput;
        }
    }

}
