package jp.coppermine.samples.hk2.inject;

import javax.inject.Inject;

import org.jvnet.hk2.annotations.Service;

@Service
public class Greeter {

    @Inject
    private Hello hello;

    public String greet() {
        return hello.say();
    }

}
