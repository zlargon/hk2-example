package com.zlargon.qualifier;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.zlargon.qualifier.qualifiers.Japanese;
import org.glassfish.hk2.api.IterableProvider;
import org.jvnet.hk2.annotations.Service;

@Service
public class Greeter {

    @Inject
    private IterableProvider<Hello> greetings;

    @Japanese
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
