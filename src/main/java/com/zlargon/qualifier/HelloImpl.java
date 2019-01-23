package com.zlargon.qualifier;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named
@Service
public class HelloImpl implements Hello {

    @Override
    public String say() {
        return "Hello";
    }

}
