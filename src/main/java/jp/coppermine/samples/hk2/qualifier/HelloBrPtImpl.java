package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.Portuguese;

@Portuguese
@Service
public class HelloBrPtImpl implements Hello {

    @Override
    public String say() {
        return "Olá";
    }

}
