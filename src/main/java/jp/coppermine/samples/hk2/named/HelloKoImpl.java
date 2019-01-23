package jp.coppermine.samples.hk2.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Korean")
@Service
public class HelloKoImpl implements Hello {

    @Override
    public String say() {
        return "안녕하세요";
    }

}
