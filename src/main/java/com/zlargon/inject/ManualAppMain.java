package com.zlargon.inject;

import org.glassfish.hk2.api.DynamicConfiguration;
import org.glassfish.hk2.api.DynamicConfigurationService;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.api.ServiceLocatorFactory;
import org.glassfish.hk2.utilities.BuilderHelper;

import com.zlargon.named.Greeter;

public class ManualAppMain {

    public static void main(String[] args) {
        // Obtain a ServiceLocator object
        ServiceLocatorFactory factory = ServiceLocatorFactory.getInstance();
        ServiceLocator locator = factory.create("default");

        // Obtain the DynamicConfiguration object for binding a service to a contract.
        DynamicConfigurationService dcs = locator.getService(DynamicConfigurationService.class);
        DynamicConfiguration config = dcs.createDynamicConfiguration();

        // binding a service to a contract.
        config.bind(BuilderHelper.link(Greeter.class).build());
        config.bind(BuilderHelper.link(HelloImpl.class).to(Hello.class).build());
        config.commit();

        // Obtain the value from a Message object and output it
        Greeter greeter = locator.getService(Greeter.class);
        System.out.println("Say: " + greeter.greet());
    }

}
