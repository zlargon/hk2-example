package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.Japanese;
import org.jvnet.hk2.annotations.Service;

@Japanese
@Service
public class HelloJaImpl implements Hello {

    @Override
    public String say() {
        return "こんにちは";
    }

}
