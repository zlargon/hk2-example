package jp.coppermine.samples.hk2.qualifier;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named
@Service
public class HelloImpl implements Hello {

    @Override
    public String say() {
        return "Hello";
    }

}
