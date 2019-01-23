package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.Italian;

@Italian
@Service
public class HelloItImpl implements Hello {

    @Override
    public String say() {
        return "Ciao";
    }

}
