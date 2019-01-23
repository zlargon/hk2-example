package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("English")
@Service
public class HelloImpl implements Hello {

    @Override
    public String say() {
        return "Hello";
    }

}
