package jp.coppermine.samples.hk2.instance;

import org.glassfish.hk2.api.DynamicConfiguration;
import org.glassfish.hk2.api.DynamicConfigurationService;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.api.ServiceLocatorFactory;
import org.glassfish.hk2.utilities.BuilderHelper;

public class ManualAppMain {

    public static void main(String[] args) {
        // Obtain a ServiceLocator object
        ServiceLocatorFactory factory = ServiceLocatorFactory.getInstance();
        ServiceLocator locator = factory.create("default");

        // Obtain the DynamicConfiguration object for binding a service to a contract.
        DynamicConfigurationService dcs = locator.getService(DynamicConfigurationService.class);
        DynamicConfiguration config = dcs.createDynamicConfiguration();

        // binding a service to a contract.
        config.bind(BuilderHelper.link(MessageImpl.class).to(Message.class).build());
        config.commit();

        // Obtain the value from a Message object and output it
        Message message = locator.getService(Message.class);
        System.out.println(message.get());
    }

}
