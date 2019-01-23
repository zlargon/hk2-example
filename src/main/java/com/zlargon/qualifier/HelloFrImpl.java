package com.zlargon.qualifier;

import com.zlargon.qualifier.qualifiers.France;
import org.jvnet.hk2.annotations.Service;

@France
@Service
public class HelloFrImpl implements Hello {

    @Override
    public String say() {
        return "Bonjour";
    }

}
