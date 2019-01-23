package jp.coppermine.samples.hk2.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Japanese")
@Service
public class HelloJaImpl implements Hello {

    @Override
    public String say() {
        return "こんにちは";
    }

}
