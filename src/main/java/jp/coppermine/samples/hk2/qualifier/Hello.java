package jp.coppermine.samples.hk2.qualifier;

import org.jvnet.hk2.annotations.Contract;

@Contract
public interface Hello {
    String say();
}
