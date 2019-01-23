package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.France;

@France
@Service
public class HelloFrImpl implements Hello {

    @Override
    public String say() {
        return "Bonjour";
    }

}
