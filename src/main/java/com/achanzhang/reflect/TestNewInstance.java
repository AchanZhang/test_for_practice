package com.achanzhang.reflect;

public class TestNewInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.achanzhang.reflect.Person";
        Class clazz = Class.forName(className);

        Object obj = clazz.newInstance();
        System.out.println(obj);
    }

}
