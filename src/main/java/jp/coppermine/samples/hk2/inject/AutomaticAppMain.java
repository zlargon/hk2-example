package jp.coppermine.samples.hk2.inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

import jp.coppermine.samples.hk2.named.Greeter;

public class AutomaticAppMain {

    public static void main(String[] args) {
        // Obtain a ServiceLocator object
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();

        // Obtain the value from a Message object and output it
        Greeter greeter = locator.getService(Greeter.class);
        System.out.println("Say: " + greeter.greet());
    }

}
