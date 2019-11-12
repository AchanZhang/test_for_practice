package com.achanzhang.highConcurrency.singletonExample;

import net.jcip.annotations.ThreadSafe;

/**
 * 懒汉模式(线程安全,不推荐，性能开销)
 * 单例实例在第一次使用时进行创建
 */
@ThreadSafe
public class SingletonExample3 {

    //私有的构造函数
    private SingletonExample3(){

    }

    //单例对象
    private static SingletonExample3 instance = null;

    //静态的工厂方法
    public static synchronized SingletonExample3 getInstance(){
        if (instance == null){
            instance = new SingletonExample3();
        }
        return instance;
    }
}
