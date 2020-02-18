package com.achanzhang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class DAO<T> {
    private Class<T> clazz;
    //根据id获取一个对象
    T get(Integer id) {
        return null;
    }

    //保存一个对象
    void save(T entity) {
    }

    public DAO(){
        System.out.println("DAO's Constructor...");
        //this: 父类构造方法中的this指的是子类对象，因此此时是PersonDao对象在调用
        System.out.println(this);
        System.out.println(this.getClass());

        //获取DAO子类的父亲,只能获取父类的类型名称
        Class<?> class1 = this.getClass().getSuperclass();
        System.out.println(class1);

        //获取DAO子类带泛型参数的父类
        Type type = this.getClass().getGenericSuperclass();
        System.out.println(type);

        //获取具体的泛型参数 DAO<T>
        //注意Type是一个空的接口，这里使用它的子类ParameterizedType,表示带参数的类类型(即泛型)
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] arges = parameterizedType.getActualTypeArguments();
            //得到的是一个数组，因为可能父类是多个泛型参数public class DAO<T,PK>{}
            System.out.println(Arrays.asList(arges));
            if (arges != null && arges.length > 0) {
                Type arg = arges[0];
                System.out.println(arg);

                if (arg instanceof Class<?>) {
                    clazz = (Class<T>) arg;
                }
            }
        }
    }
}
