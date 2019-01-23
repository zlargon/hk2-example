package com.zlargon.named;

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
        config.bind(BuilderHelper.link(Greeter.class).build());
        config.bind(BuilderHelper.link(HelloImpl.class).to(Hello.class).build());
        config.bind(BuilderHelper.link(HelloJaImpl.class).to(Hello.class).named("Japanese").build());
        config.bind(BuilderHelper.link(HelloDeImpl.class).to(Hello.class).named("German").build());
        config.bind(BuilderHelper.link(HelloFrImpl.class).to(Hello.class).named("France").build());
        config.bind(BuilderHelper.link(HelloItImpl.class).to(Hello.class).named("Italian").build());
        config.bind(BuilderHelper.link(HelloEsImpl.class).to(Hello.class).named("Spanish").build());
        config.bind(BuilderHelper.link(HelloBrPtImpl.class).to(Hello.class).named("Portuguese").build());
        config.bind(BuilderHelper.link(HelloZhChImpl.class).to(Hello.class).named("Chinese").build());
        config.bind(BuilderHelper.link(HelloZhTwImpl.class).to(Hello.class).named("TraditionalChinese").build());
        config.bind(BuilderHelper.link(HelloKoImpl.class).to(Hello.class).named("Korean").build());
        config.commit();

        // Obtain the value from a Message object and output it
        Greeter greeter = locator.getService(Greeter.class);

        System.out.println("All greetings:");
        greeter.getAll().forEach(System.out::println);

        System.out.println();

        System.out.println("Say: " + greeter.greet());
    }

}
