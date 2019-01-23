package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.Portuguese;
import org.jvnet.hk2.annotations.Service;

@Portuguese
@Service
public class HelloBrPtImpl implements Hello {

    @Override
    public String say() {
        return "Olá";
    }

}
