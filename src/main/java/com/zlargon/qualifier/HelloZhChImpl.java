package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.Chinese;
import org.jvnet.hk2.annotations.Service;

@Chinese
@Service
public class HelloZhChImpl implements Hello {

    @Override
    public String say() {
        return "你好";
    }

}
