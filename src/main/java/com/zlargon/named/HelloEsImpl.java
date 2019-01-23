package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Spanish")
@Service
public class HelloEsImpl implements Hello {

    @Override
    public String say() {
        return "Hola";
    }

}
