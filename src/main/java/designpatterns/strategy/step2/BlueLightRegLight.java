package designpatterns.strategy.step2;

/**
 * Context
 */
public class BlueLightRegLight {
    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.redLight();
    }
}
