package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.Japanese;

@Japanese
@Service
public class HelloJaImpl implements Hello {

    @Override
    public String say() {
        return "こんにちは";
    }

}
