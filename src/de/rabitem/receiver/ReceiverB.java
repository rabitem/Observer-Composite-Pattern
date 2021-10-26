package de.rabitem.receiver;

import de.rabitem.Observer;
import de.rabitem.composite.Component;

public class ReceiverB implements Observer {
    @Override
    public void update(Component component) {
        System.out.println(component.returnName());
    }
}
