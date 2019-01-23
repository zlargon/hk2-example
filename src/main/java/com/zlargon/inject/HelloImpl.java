package com.zlargon.inject;

import org.jvnet.hk2.annotations.Service;

@Service
public class HelloImpl implements Hello {

    @Override
    public String say() {
        return "Hello";
    }

}
