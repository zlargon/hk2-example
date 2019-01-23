package com.zlargon.qualifier;

import org.glassfish.hk2.api.DynamicConfiguration;
import org.glassfish.hk2.api.DynamicConfigurationService;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.api.ServiceLocatorFactory;
import org.glassfish.hk2.utilities.BuilderHelper;

import com.zlargon.qualifier.qualifiers.Chinese;
import com.zlargon.qualifier.qualifiers.France;
import com.zlargon.qualifier.qualifiers.German;
import com.zlargon.qualifier.qualifiers.Italian;
import com.zlargon.qualifier.qualifiers.Japanese;
import com.zlargon.qualifier.qualifiers.Korean;
import com.zlargon.qualifier.qualifiers.Portuguese;
import com.zlargon.qualifier.qualifiers.Qualifiers;
import com.zlargon.qualifier.qualifiers.Spanish;
import com.zlargon.qualifier.qualifiers.TraditionalChinese;

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
        config.bind(BuilderHelper.link(HelloJaImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(Japanese.class)).build());
        config.bind(BuilderHelper.link(HelloDeImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(German.class)).build());
        config.bind(BuilderHelper.link(HelloFrImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(France.class)).build());
        config.bind(BuilderHelper.link(HelloItImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(Italian.class)).build());
        config.bind(BuilderHelper.link(HelloEsImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(Spanish.class)).build());
        config.bind(BuilderHelper.link(HelloBrPtImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(Portuguese.class)).build());
        config.bind(BuilderHelper.link(HelloZhChImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(Chinese.class)).build());
        config.bind(BuilderHelper.link(HelloZhTwImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(TraditionalChinese.class)).build());
        config.bind(BuilderHelper.link(HelloKoImpl.class).to(Hello.class).qualifiedBy(Qualifiers.getInstance(Korean.class)).build());
        config.commit();

        // Obtain the value from a Message object and output it
        Greeter greeter = locator.getService(Greeter.class);

        System.out.println("All greetings:");
        greeter.getAll().forEach(System.out::println);

        System.out.println();

        System.out.println("Say: " + greeter.greet());
    }

}
