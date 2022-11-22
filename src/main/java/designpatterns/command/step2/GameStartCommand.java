package designpatterns.command.step2;

import designpatterns.command.step1.Game;

public class GameStartCommand implements Command {
    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
