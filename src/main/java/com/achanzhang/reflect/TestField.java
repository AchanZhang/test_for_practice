package com.achanzhang.reflect;

import java.lang.reflect.Field;

public class TestField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String className = "com.achanzhang.reflect.Person";
        Class clazz = Class.forName(className);

        //1.获取字段
        //1.1获取所有字段 --字段数组
        //可以获取公用和私有的所有字段，但不能获取父类字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(" " + field.getName());
        }
        System.out.println();

        //1.2 获取指定字段
        Field field = clazz.getDeclaredField("name");
        System.out.println(field.getName());

        Person person = new Person("ABC",12);

        //2.使用字段
        //2.1获取指定对象的指定字段的值
        Object val = field.get(person);
        System.out.println(val);

        //2.2设置指定对象的指定对象Field值
        field.set(person,"DEF");
        System.out.println(person.getName());

        //2.3如果字段时私有的，不管是读值还是写值，都必须先调用setAccessible(true)方法
        //比如Person类中，字段name是公用的，age是私有的
        field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println(field.get(person));
    }
}
