package de.rabitem.composite;

public class StringMessage2 implements Component {
    @Override
    public String returnName() {
        return getClass().getSimpleName();
    }
}
