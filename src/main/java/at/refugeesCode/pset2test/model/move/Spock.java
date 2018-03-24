package at.refugeesCode.pset2test.model.move;

import org.springframework.stereotype.Component;

@Component
public class Spock implements Move {

    Spock() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Scissors.class || move.getClass() == Rock.class;
    }
}
