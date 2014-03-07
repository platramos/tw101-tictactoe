import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpramos on 3/6/14.
 */

public class HumanPlayer {

    int playerNumber;

    public HumanPlayer(int number){
        this.playerNumber = number;
    }

    public void makeMove(Board board, String userCommand) {

        board.fillBoard(this.playerNumber, userCommand);

    }

    public String takeUserInput(BufferedReader bufferedReader){
        System.out.println("Make a move Player " + this.playerNumber + "!");

        List<String> playedMoves = new ArrayList<String>();
        String userInput = "";

        try{
            if (playedMoves.contains(userInput)) {
                System.out.println("This Space is Occupied! Select Another");
            }

            userInput = bufferedReader.readLine();
            playedMoves.add(userInput);
           return userInput;

        } catch (IOException exception){
            System.out.println("You made an invalid selection");
            return userInput;
        }
    }
}
