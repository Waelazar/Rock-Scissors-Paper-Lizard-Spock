package at.refugeesCode.pset2test.controller.player;


import at.refugeesCode.pset2test.model.move.Move;
import at.refugeesCode.pset2test.model.move.Moves;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Scanner;

@Component
public class HumanPlayer implements Player {

    private Scanner scanner = new Scanner(System.in);

    HumanPlayer() {
    }

    @Override
    public Move getMove() {
        Optional<Move> move = Optional.empty();
        while (!move.isPresent()) {
            move = chooseOneMove();
        }
        return move.get();
    }

    private Optional<Move> chooseOneMove() {
        String posibleMoves = Moves.asString();
        System.out.print("Choose a move (" + posibleMoves + "): ");
        String choice = scanner.nextLine();
        return Moves.asList().stream()
                .filter(move -> move.getClass().getSimpleName().equalsIgnoreCase(choice))
                .findFirst();
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.print("Do you want to play again? (y/n)");
        String choice = scanner.nextLine();
        return choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes");
    }
}
