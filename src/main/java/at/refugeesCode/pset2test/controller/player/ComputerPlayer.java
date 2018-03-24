package at.refugeesCode.pset2test.controller.player;


import at.refugeesCode.pset2test.model.move.Move;
import at.refugeesCode.pset2test.model.move.Moves;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ComputerPlayer implements Player {

    private Random random = new Random();

    ComputerPlayer() {
    }

    @Override
    public Move getMove() {
        List<Move> moves = Moves.asList();
        int randomIndex = random.nextInt(moves.size());
        return moves.get(randomIndex);
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
