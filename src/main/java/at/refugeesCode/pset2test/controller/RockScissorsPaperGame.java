package at.refugeesCode.pset2test.controller;

import at.refugeesCode.pset2test.controller.player.Player;
import at.refugeesCode.pset2test.controller.player.Players;
import at.refugeesCode.pset2test.model.Result;
import at.refugeesCode.pset2test.model.move.Move;
import at.refugeesCode.pset2test.view.Host;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RockScissorsPaperGame {

    private Host host = new Host();
    private Judge judge = new Judge();

    public void play() {
        // get players

        // as long as players want to play
        // play one round
        // ask them if they want to play again


        host.welcome();
        List<Player> players = Players.getTwoPlayers();
        Player player1 = players.get(0);
        Player player2 = players.get(1);

        boolean wantToPlayAgain = true;
        while (wantToPlayAgain) {
            playOneRound(player1, player2);
            wantToPlayAgain = ask(player1, player2);
        }

        host.goodbye();
    }

    private void playOneRound(Player player1, Player player2) {
        Move move1 = player1.getMove();
        Move move2 = player2.getMove();
        Result result = judge.getResult(move1, move2);
        host.display(result);
    }

    private boolean ask(Player player1, Player player2) {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }
}
