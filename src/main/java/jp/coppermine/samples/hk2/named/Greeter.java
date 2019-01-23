package jp.coppermine.samples.hk2.named;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.glassfish.hk2.api.IterableProvider;
import org.jvnet.hk2.annotations.Service;

@Service
public class Greeter {

    @Inject
    private IterableProvider<Hello> greetings;

    @Named("Japanese")
    @Inject
    private Hello hello;

    public List<String> getAll() {
        List<String> list = new ArrayList<>();
        greetings.forEach(e -> list.add(e.say()));
        return list;
    }

    public String greet() {
        return hello.say();
    }

}
