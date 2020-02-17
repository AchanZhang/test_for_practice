package com.achanzhang.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class TestInvoke {

    public Object invokeByClassAndMethod(Object obj, String methodName, Object ... args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //1.获取Method对象
        //因为getMethod的参数为Class列表类型，所以要把参数args转化为对应的Class类型
        Class<?>[] parameterType = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterType[i] = args[i].getClass();
            System.out.println(parameterType[i]);
        }
        Method method = obj.getClass().getDeclaredMethod(methodName, parameterType);
        return method.invoke(obj, args);
    }

    public Object invokeByClassNameAndMethodName(String className, String methodName, Object ... args) {
        try {
            Object obj = Class.forName(className).newInstance();
            return this.invokeByClassAndMethod(obj, methodName, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestInvoke testInvoke = new TestInvoke();
        Object obj = new Person();
        testInvoke.invokeByClassAndMethod(obj, "test","wang",1);
        testInvoke.invokeByClassNameAndMethodName("com.achanzhang.reflect.Person", "test", "achanzhang", 12);
        //使用系统的方法（前提是此类有一个无参的构造器）
        Object result = testInvoke.invokeByClassNameAndMethodName("java.text.SimpleDateFormat", "format", new Date());
        System.out.println(result);
    }
}
