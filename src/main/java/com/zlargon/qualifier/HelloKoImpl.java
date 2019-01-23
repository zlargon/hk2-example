package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.Korean;
import org.jvnet.hk2.annotations.Service;

@Korean
@Service
public class HelloKoImpl implements Hello {

    @Override
    public String say() {
        return "안녕하세요";
    }

}
