package com.achanzhang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//描述构造器
public class TestConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className = "com.achanzhang.reflect.Person";
        Class<Person> clazz = (Class<Person>) Class.forName(className);

        //1.获取Constructor对象
        //1.1 获取全部
        Constructor<Person>[] constructors = (Constructor<Person>[]) Class.forName(className).getConstructors();

        for (Constructor<Person> constructor : constructors) {
            System.out.println(constructor);
        }

        //1.2获取某一个，需要参数列表
        Constructor<Person> constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //2.调用构造器的newInstance()方法创建对象
        Object obj = constructor.newInstance("achan",1);
    }
}
