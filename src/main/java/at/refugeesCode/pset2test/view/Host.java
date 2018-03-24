package at.refugeesCode.pset2test.view;

import at.refugeesCode.pset2test.model.Result;
import at.refugeesCode.pset2test.model.move.Move;
import org.springframework.stereotype.Component;

@Component
public class Host {

    public void welcome() {
        System.out.println("Welcome to the Rock Scissors Paper Tournament");
    }

    public void goodbye() {
        System.out.println("Goodbye.");
    }

    public void display(Result result) {
        System.out.println("Player 1 chose: " + getName(result.getMove1()));
        System.out.println("Player 2 chose: " + getName(result.getMove2()));
        System.out.println(result.getWinner());
    }

    private String getName(Move move) {
        return move.getClass().getSimpleName();
    }
}
