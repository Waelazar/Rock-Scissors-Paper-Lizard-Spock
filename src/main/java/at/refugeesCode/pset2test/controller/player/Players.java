package at.refugeesCode.pset2test.controller.player;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Players {

    private Players() {
    }

    public static List<Player> getTwoPlayers() {
        return Arrays.asList(new HumanPlayer(), new ComputerPlayer());
    }
}
