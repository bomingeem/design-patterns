package designpatterns.factorymethod.step2;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "bomingeem@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "bomingeem@gmail.com");
        System.out.println(blackship);
    }
}
