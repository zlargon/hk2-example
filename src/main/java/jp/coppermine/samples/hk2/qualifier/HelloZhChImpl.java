package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Service;

import jp.coppermine.samples.hk2.qualifier.qualifiers.Chinese;

@Chinese
@Service
public class HelloZhChImpl implements Hello {

    @Override
    public String say() {
        return "你好";
    }

}
