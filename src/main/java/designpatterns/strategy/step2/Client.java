package designpatterns.strategy.step2;

public class Client {
    public static void main(String[] args) {
        BlueLightRegLight game = new BlueLightRegLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
