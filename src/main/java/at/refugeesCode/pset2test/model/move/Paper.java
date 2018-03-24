package at.refugeesCode.pset2test.model.move;

import org.springframework.stereotype.Component;

@Component
public class Paper implements Move {

    Paper() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Rock.class || move.getClass() == Spock.class;
    }
}
