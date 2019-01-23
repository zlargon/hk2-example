package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Korean")
@Service
public class HelloKoImpl implements Hello {

    @Override
    public String say() {
        return "안녕하세요";
    }

}
