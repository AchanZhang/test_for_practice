package com.achanzhang.reflect;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.achanzhang.reflect.Person");

        //1.获取方法
        //1.1 获取clazz对应类中的所有方法--方法数组（一）
        //  不能获取private方法，且获取从父类继承来的所有方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(" " + method.getName());
        }
        System.out.println();

        //1.2获取所有方法，包括私有方法--方法数组（二）
        //所有声明的方法，都可以获取到，且只获取当前类
        methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" " + method.getName());
        }
        System.out.println();

        //1.3获取指定的方法
        //需要参数名称和参数列表，无参则不需要写
        Method method = clazz.getDeclaredMethod("setName", String.class);
        System.out.println(method);

        method = clazz.getDeclaredMethod("setAge", Integer.class);

        //2.执行方法
        //invoke第一个参数表示执行哪个对象的方法，剩下的参数是执行方法时需要传入的参数
        Object obj = clazz.newInstance();
        method.invoke(obj, 2);
        System.out.println();
        Person person2 = (Person) obj;
        System.out.println(person2.getAge());
        //私有方法的执行，必须在调用invoke之前加上一句method.setAccessible(true);
    }
}
