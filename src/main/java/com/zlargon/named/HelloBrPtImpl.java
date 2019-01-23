package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Portuguese")
@Service
public class HelloBrPtImpl implements Hello {

    @Override
    public String say() {
        return "Olá";
    }

}
