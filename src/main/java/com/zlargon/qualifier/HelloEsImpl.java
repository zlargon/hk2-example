package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.Spanish;
import org.jvnet.hk2.annotations.Service;

@Spanish
@Service
public class HelloEsImpl implements Hello {

    @Override
    public String say() {
        return "Hola";
    }

}
