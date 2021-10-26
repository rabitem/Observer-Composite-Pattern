package de.rabitem.composite;

import java.util.ArrayList;

public class Composite implements Component{

    private final ArrayList<Component> children = new ArrayList<>();

    @Override
    public String returnName() {
        StringBuilder returnString = new StringBuilder("Message: ");
        returnString.append(this.getClass().getSimpleName()).append(" ");
        children.forEach(component -> returnString.append(component.returnName()).append(" "));
        return returnString.toString();
    }

    public void addComponent(Component component) {
        this.children.add(component);
    }

    public void removeComponent(Component component) {
        this.children.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return children;
    }
}
