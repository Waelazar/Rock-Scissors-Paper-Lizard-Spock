package at.refugeesCode.pset2test.model.move;

import org.springframework.stereotype.Component;

@Component
public class Rock implements Move {

    Rock() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Scissors.class || move.getClass() == Lizard.class;
    }

}
