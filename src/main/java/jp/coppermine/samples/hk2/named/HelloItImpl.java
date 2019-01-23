package jp.coppermine.samples.hk2.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Italian")
@Service
public class HelloItImpl implements Hello {

    @Override
    public String say() {
        return "Ciao";
    }

}
