package at.refugeesCode.pset2test.model.move;

import org.springframework.stereotype.Component;

@Component
public class Scissors implements Move {

    Scissors() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Paper.class || move.getClass() == Lizard.class;
    }
}
