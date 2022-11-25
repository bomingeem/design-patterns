package designpatterns.mediator.step1;

public class Guest {
    private Restaurant restaurant = new Restaurant();
    private CleaningService cleaningService = new CleaningService();

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTower(int numberOfTowers) {
        cleaningService.getTower(this, numberOfTowers);
    }
}
