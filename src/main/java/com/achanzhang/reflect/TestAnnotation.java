package com.achanzhang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //必须通过反射的方式为属性赋值，才能获取到注解
        String className = "com.achanzhang.reflect.Person";

        Class<?> clazz = Class.forName(className);
        Object obj = clazz.newInstance();

        Method method = clazz.getDeclaredMethod("setAge", Integer.class);
        int val = 10;

        //获取指定名称的注解
        Annotation annotation = method.getAnnotation(AgeValidator.class);
        if (annotation != null) {
            AgeValidator ageValidator = (AgeValidator) annotation;
            if (val < ageValidator.min() || val > ageValidator.max()) {
                throw new RuntimeException("年龄非法");
            }
        }
        method.invoke(obj, 20);
        Person person = (Person) obj;
        System.out.println(person.getAge());
    }
}
