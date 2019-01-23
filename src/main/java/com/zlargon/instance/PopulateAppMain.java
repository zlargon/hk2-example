package com.zlargon.instance;

import org.glassfish.hk2.api.DynamicConfigurationService;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.api.ServiceLocatorFactory;

public class PopulateAppMain {

    public static void main(String[] args) throws Exception {
        // Obtain a ServiceLocator object
        ServiceLocatorFactory factory = ServiceLocatorFactory.getInstance();
        ServiceLocator locator = factory.create("default");

        // Obtain the DynamicConfiguration object for binding a service to a contract.
        DynamicConfigurationService dcs = locator.getService(DynamicConfigurationService.class);
        dcs.getPopulator().populate();

        // Obtain the value from a Message object and output it
        Message message = locator.getService(Message.class);
        System.out.println(message.get());
    }

}
