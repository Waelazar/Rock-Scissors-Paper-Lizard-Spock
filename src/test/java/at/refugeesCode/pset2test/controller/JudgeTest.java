package at.refugeesCode.pset2test.controller;

import at.refugeesCode.pset2test.model.Result;
import at.refugeesCode.pset2test.model.move.Move;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


class JudgeTest {

    @Autowired
    private Move firstMove;

    @Autowired
    private Move secondMove;

    @Autowired
    private Result result;

    @Autowired
    private Judge judge = new Judge();

    @Test
    void getResultfirstplayerWon() {

        firstMove = Mockito.mock(Move.class);
        secondMove = Mockito.mock(Move.class);

        when(firstMove.defeats(secondMove)).thenReturn(true);
        when(secondMove.defeats(firstMove)).thenReturn(false);

        Result result1 = judge.getResult(firstMove, secondMove);

        assertThat(result1.getWinner(), is("Player 1 wins"));
    }

    @Test
    void getResultSecondPlayerWin() {
        firstMove = Mockito.mock(Move.class);
        secondMove = Mockito.mock(Move.class);

        when(firstMove.defeats(secondMove)).thenReturn(false);
        when(secondMove.defeats(firstMove)).thenReturn(true);

        Result result1 = judge.getResult(firstMove, secondMove);

        assertEquals(result1.getWinner(), "Player 2 wins");
    }

    @Test
    void getResultNobodyWins() {
        firstMove = Mockito.mock(Move.class);
        secondMove = Mockito.mock(Move.class);

        when(firstMove.defeats(secondMove)).thenReturn(false);
        when(secondMove.defeats(firstMove)).thenReturn(false);

        Result result1 = judge.getResult(firstMove, secondMove);

        assertEquals(result1.getWinner(), "Nobody wins");
    }
}