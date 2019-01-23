package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("German")
@Service
public class HelloDeImpl implements Hello {

    @Override
    public String say() {
        return "Hallo";
    }

}
