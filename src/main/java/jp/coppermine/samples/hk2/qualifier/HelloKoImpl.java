package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.Korean;

@Korean
@Service
public class HelloKoImpl implements Hello {

    @Override
    public String say() {
        return "안녕하세요";
    }

}
