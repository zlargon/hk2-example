package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("France")
@Service
public class HelloFrImpl implements Hello {

    @Override
    public String say() {
        return "Bonjour";
    }

}
