package at.refugeesCode.pset2test.controller.player;


import at.refugeesCode.pset2test.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}
