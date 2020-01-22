package com.achanzhang.reflect;

import java.lang.reflect.Field;

public class TestClassField {
    public Object getFieldValue(Object obj, Field field) throws IllegalAccessException {
        field.setAccessible(true);
        return field.get(obj);
    }

    public void setFieldValue(Object obj, Field field, Object val) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, val);
    }

    public Field getField(Class clazz, String fieldName) throws NoSuchFieldException {
        Field field = null;
        for (Class clazz2 = clazz ; clazz2 != Object.class ; clazz2 = clazz2.getSuperclass()) {
            field = clazz2.getDeclaredField(fieldName);
        }
        return field;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        TestClassField testClassField = new TestClassField();
        String className = "com.achanzhang.reflect.Student";
        String fieldName = "age";
        Object val = 20;

        //todo NoSuchFieldException: age
        Object obj = null;
        Class clazz = Class.forName(className);
        Field field = testClassField.getField(clazz, fieldName);
        obj = clazz.newInstance();
        testClassField.setFieldValue(obj, field, val);
        Object value = testClassField.getFieldValue(obj, field);
    }
}
