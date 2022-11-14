package designpatterns.factorymethod.step2;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "bomingeem@gmail.com");
        client.print(new BlackshipFactory(), "blackship", "bomingeem@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
