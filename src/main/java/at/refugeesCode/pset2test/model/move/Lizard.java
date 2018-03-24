package at.refugeesCode.pset2test.model.move;

import org.springframework.stereotype.Component;

@Component
public class Lizard implements Move {

    Lizard() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Spock.class || move.getClass() == Paper.class;
    }
}
