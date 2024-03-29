package at.refugeesCode.pset2test.model;

import at.refugeesCode.pset2test.model.move.Move;
import org.springframework.stereotype.Component;

@Component
public class Result {

    private Move move1;

    private Move move2;

    private String winner;

    public Move getMove1() {
        return move1;
    }

    public void setMove1(Move move1) {
        this.move1 = move1;
    }

    public Move getMove2() {
        return move2;
    }

    public void setMove2(Move move2) {
        this.move2 = move2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
