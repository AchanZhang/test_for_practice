package com.achanzhang.reflect.test;

public class TargetObject {
    private String value;

    public TargetObject() {
        value = "Hello Reflect!";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
