package com.achanzhang.overrideEquals;

/**
 * @author zyc97
 */
public class OverrideHashcode extends Personsa {
    public OverrideHashcode(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
