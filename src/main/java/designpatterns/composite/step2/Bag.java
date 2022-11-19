package designpatterns.composite.step2;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return this.components.stream().mapToInt(Component::getPrice).sum();
    }
}
