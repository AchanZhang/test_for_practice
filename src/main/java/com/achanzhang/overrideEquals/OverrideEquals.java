package com.achanzhang.overrideEquals;

/**
 * @author zyc97
 */
public class OverrideEquals extends Personsa {
    public OverrideEquals(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return ((Personsa) obj).getName().equals(getName());
    }
}
