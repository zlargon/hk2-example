package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.Spanish;

@Spanish
@Service
public class HelloEsImpl implements Hello {

    @Override
    public String say() {
        return "Hola";
    }

}
