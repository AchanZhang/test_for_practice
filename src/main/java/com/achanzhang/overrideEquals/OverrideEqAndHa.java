package com.achanzhang.overrideEquals;

/**
 * @author zyc97
 */
public class OverrideEqAndHa extends OverrideEquals {
    public OverrideEqAndHa(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
