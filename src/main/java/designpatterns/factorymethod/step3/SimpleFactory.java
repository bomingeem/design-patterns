package designpatterns.factorymethod.step3;

import designpatterns.factorymethod.step2.Blackship;
import designpatterns.factorymethod.step2.Whiteship;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
