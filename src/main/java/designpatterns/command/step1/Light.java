package designpatterns.command.step1;

public class Light {
    private boolean isOn;

    public void on() {
        System.out.println("불을 켭니다.");
    }

    public void off() {
        System.out.println("불을 끕니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
