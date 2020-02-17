package com.achanzhang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestSuperGeneric {
    private Class<?> getSuperClassGenericType(Class<?> clazz, int index) {
        Type type = clazz.getGenericSuperclass();
        if (!(type instanceof ParameterizedType)) {
            return null;
        }

        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] args = parameterizedType.getActualTypeArguments();

        if (args == null) {
            return null;
        }

        if (index < 0 || index > args.length - 1) {
            return null;
        }

        Type arg = args[index];
        if (arg instanceof Class<?>) {
            return (Class<?>) arg;
        }

        return null;
    }

    private Class<?> getSuperGenericType(Class<?> clazz) {
        return getSuperClassGenericType(clazz, 0);
    }

    public static void main(String[] args) {
        TestSuperGeneric testSuperGeneric = new TestSuperGeneric();
        Class<?> clazz = PersonDAO.class;
        Class<?> argClazz = testSuperGeneric.getSuperClassGenericType(clazz, 0);
        System.out.println(argClazz);
    }
}
