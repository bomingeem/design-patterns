package designpatterns.command.step2;

import designpatterns.command.step1.Game;
import designpatterns.command.step1.Light;

public class Button {
    //invoker
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
    //invoker

    public static void main(String[] args) {
        Button button = new Button(new GameStartCommand(new Game()));
        button.press();
    }
}
