package designpatterns.memento.step1;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoreGame = new Game();
        restoreGame.setBlueTeamScore(blueTeamScore);
        restoreGame.setRedTeamScore(redTeamScore);
    }
}
