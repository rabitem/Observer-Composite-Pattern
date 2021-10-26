package de.rabitem.composite;

public class StringMessage1 implements Component {
    @Override
    public String returnName() {
        return getClass().getSimpleName();
    }
}
