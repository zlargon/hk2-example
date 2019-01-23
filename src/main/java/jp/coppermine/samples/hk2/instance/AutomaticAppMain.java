package jp.coppermine.samples.hk2.instance;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

public class AutomaticAppMain {

    public static void main(String[] args) {
        // Obtain a ServiceLocator object
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();

        // Obtain the value from a Message object and output it
        Message message = locator.getService(Message.class);
        System.out.println(message.get());
    }

}
