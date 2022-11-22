package designpatterns.command.step2;

import designpatterns.command.step1.Light;

public class LightOffCommand implements Command {
    private Light light;
    @Override
    public void execute() {
        light.off();
    }
}
