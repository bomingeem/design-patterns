package designpatterns.command.step2;

import designpatterns.command.step1.Game;

public class MyApp {
    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.press();
    }
}
