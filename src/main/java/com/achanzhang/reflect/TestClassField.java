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

    public Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        Field field = null;
        for (; clazz != Object.class ; clazz = clazz.getSuperclass()) {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return field;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        TestClassField testClassField = new TestClassField();
        String className = "com.achanzhang.reflect.Student";
        String fieldName = "age";
        Object val = 20;

        Object obj = null;
        Class<?> clazz = Class.forName(className);
        Field field = testClassField.getField(clazz, fieldName);
        obj = clazz.newInstance();
        testClassField.setFieldValue(obj, field, val);
        Object value = testClassField.getFieldValue(obj, field);
        System.out.println(value);
    }
}
