package com.achanzhang.highConcurrency.singletonExample;

import net.jcip.annotations.ThreadSafe;

/**
 * 饿汉模式（创建多个单例对象时，会影响性能）
 * 单例实例在类装载时进行创建
 */
@ThreadSafe
public class SingletonExample2 {

    //私有的构造函数
    private SingletonExample2(){

    }

    //单例对象（静态域初始化）
    private static SingletonExample2 instance = new SingletonExample2();

    //静态的工厂方法
    public static SingletonExample2 getInstance(){
        return instance;
    }
}
