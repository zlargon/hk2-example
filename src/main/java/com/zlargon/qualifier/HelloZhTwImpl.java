package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.TraditionalChinese;
import org.jvnet.hk2.annotations.Service;

@TraditionalChinese
@Service
public class HelloZhTwImpl implements Hello {

    @Override
    public String say() {
        return "你好";
    }

}
