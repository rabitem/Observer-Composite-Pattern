package de.rabitem;

import de.rabitem.composite.Component;

import java.util.ArrayList;

public abstract class Subject<T extends Observer> {

    private final ArrayList<T> observers = new ArrayList<>();

    public void attach(T o) {
        observers.add(o);
    }

    public void detach(T o) {
        observers.remove(o);
    }

    public void sendUpdate(Component component) {
        observers.forEach(t -> t.update(component));
    }
}
