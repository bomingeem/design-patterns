package designpatterns.command.step2;

import designpatterns.command.step1.Game;

public class GameEndCommand implements Command {
    private Game game;

    @Override
    public void execute() {
        game.end();
    }
}
