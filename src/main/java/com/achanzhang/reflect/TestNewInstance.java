package com.achanzhang.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

public class TestNewInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.achanzhang.reflect.Person";
        Class<?> clazz = Class.forName(className);
        Object obj = clazz.newInstance();
        System.out.println(obj);

        Class<?> aClass = obj.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
    }

}
