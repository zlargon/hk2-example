package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.Italian;
import org.jvnet.hk2.annotations.Service;

@Italian
@Service
public class HelloItImpl implements Hello {

    @Override
    public String say() {
        return "Ciao";
    }

}
