package at.refugeesCode.pset2test.controller;

import at.refugeesCode.pset2test.model.Result;
import at.refugeesCode.pset2test.model.move.Move;
import at.refugeesCode.pset2test.model.move.Rock;
import at.refugeesCode.pset2test.model.move.Scissors;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.is;


class JudgeTest {

    @Autowired
    private Result result = new Result();

    @Autowired
    private Judge judge = new Judge();

    @org.junit.jupiter.api.Test
    void getResult() {

        Move move1 = Mockito.mock(Move.class);
        Move move2 = Mockito.mock(Move.class);

        Rock rock = Mockito.mock(Rock.class);
        boolean defeats = rock.defeats(move1);

        Scissors scissors = Mockito.mock(Scissors.class);
        boolean defeats1 = scissors.defeats(rock);

        Result result = judge.getResult(move1, move2);
        Result result1 = judge.getResult(rock, scissors);

        Assert.assertThat(defeats1,is(false));
    }
}