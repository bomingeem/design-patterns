package designpatterns.factorymethod.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("whiteship", "bomingeem@gmail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "bomingeem@gmail.com");
        System.out.println(blackship);
    }
}
