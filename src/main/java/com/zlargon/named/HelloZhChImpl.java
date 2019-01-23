package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("Chinese")
@Service
public class HelloZhChImpl implements Hello {

    @Override
    public String say() {
        return "你好";
    }

}
