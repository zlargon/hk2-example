package com.zlargon.named;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

@Named("TraditionalChinese")
@Service
public class HelloZhTwImpl implements Hello {

    @Override
    public String say() {
        return "你好";
    }

}
