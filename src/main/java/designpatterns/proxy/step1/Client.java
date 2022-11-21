package designpatterns.proxy.step1;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
