package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.German;
import org.jvnet.hk2.annotations.Service;

@German
@Service
public class HelloDeImpl implements Hello {

    @Override
    public String say() {
        return "Hallo";
    }

}
