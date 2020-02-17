package com.achanzhang.reflect;

import javafx.beans.binding.ObjectExpression;
import org.checkerframework.common.reflection.qual.GetMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestGetSuperClass {
    /**
     *
     * @param obj 某个类的一个对象
     * @param methodName 类的一个方法的方法名
     *该方法也可能是私有方法，还可能是该方法在父类中定义的（私有）方法
     * @param args 调用该方法需要传入的参数
     * @return 返回值
     */
    public Object invokeBySuper(Object obj, String methodName, Object ... args) {
        //1.获取 Method 对象
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }

        try {
            Method method = getMethod(obj.getClass(), methodName, parameterTypes);
            method.setAccessible(true);
            //2. 执行Method方法
            //3. 返回方法的返回值
            return method.invoke(obj, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取clazz的methodName方法，该方法可能是私有方法，还可能在父类中（私有方法）
     * 如果在该类中找不到此方法，就向他的父类找，一直到object类为止
     * 这个方法的另一个作用是根据一个类名，一个方法名，追踪到并获得此方法
     * @param clazz
     * @param methodName
     * @param parameterTypes
     * @return
     */
    public Method getMethod(Class<?> clazz, String methodName, Class<?> ... parameterTypes) {
        for ( ; clazz !=Object.class ; clazz = clazz.getSuperclass()) {
            try {
                return clazz.getDeclaredMethod(methodName, parameterTypes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.achanzhang.reflect.Student";

        System.out.println(Class.forName(className).getSuperclass());

        Object obj = new Student();
        TestGetSuperClass testGetSuperClass = new TestGetSuperClass();
        //注意int和Integer
        testGetSuperClass.invokeBySuper(obj,"methodTestOne",2);
    }
}
