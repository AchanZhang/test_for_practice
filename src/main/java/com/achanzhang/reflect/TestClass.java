package com.achanzhang.reflect;

import java.lang.reflect.Field;

public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = null;

        //1.通过类名
        clazz = Person.class;

        Field[] fields = clazz.getDeclaredFields();

        //2.通过用户名
        //这种方式是用在传进来一个对象，却不知道对象类型的时候使用
        Person person = new Person();
        clazz = person.getClass();
        //意义不大，因为已经知道person类型是person类
        //如果传进来是一个object类，这种做法就是应该的
        Object obj = new Person();
        clazz = obj.getClass();

        //3.通过全类名（会抛出异常）
        //一般框架开发中这种使用的比较多，因为配置文件中一般配的都是类名，通过这种方式可以得到class实例
        String className = "com.achanzhang.reflect.Person";
        clazz = Class.forName(className);
    }
}
