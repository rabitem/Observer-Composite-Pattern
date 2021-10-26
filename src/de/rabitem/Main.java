package de.rabitem;

import de.rabitem.composite.StringMessage1;
import de.rabitem.composite.StringMessage2;
import de.rabitem.composite.Composite;
import de.rabitem.receiver.ReceiverA;
import de.rabitem.receiver.ReceiverB;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sender sender = new Sender();
        sender.attach(new ReceiverA());
        sender.attach(new ReceiverB());

        Composite message = new Composite();
        message.addComponent(new StringMessage1());
        message.addComponent(new StringMessage2());

        sender.sendUpdate(message);
    }
}
