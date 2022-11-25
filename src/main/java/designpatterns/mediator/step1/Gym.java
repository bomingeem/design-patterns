package designpatterns.mediator.step1;

public class Gym {
    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
