package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.German;

@German
@Service
public class HelloDeImpl implements Hello {

    @Override
    public String say() {
        return "Hallo";
    }

}
