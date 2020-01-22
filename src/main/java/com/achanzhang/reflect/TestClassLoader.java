package com.achanzhang.reflect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class TestClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        //1.获取一个系统的类加载器（可以获取，当前这个类TestClassLoader就是它加载的）
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //2.获取系统类加载的父类加载器（扩展类加载器，可以获取）
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        //3.获取扩展类加载器的父类加载器（引导类加载器，不可获取）
        classLoader = classLoader.getParent();
        System.out.println(classLoader);

        //4.测试当前类由哪个类加载器进行加载（系统类加载器）
        classLoader = Class.forName("com.achanzhang.reflect.TestClassLoader").getClassLoader();
        System.out.println(classLoader);

        //5.测试JDK提供的Object类由哪个类加载器负责加载（引导类）
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        TestClassLoader testClassLoader = new TestClassLoader();
        InputStream in1 = null;
        in1 = testClassLoader.getClass().getClassLoader().getResourceAsStream("1.txt");
        InputStreamReader is = new InputStreamReader(Objects.requireNonNull(in1));
        BufferedReader br = new BufferedReader(is);
        System.out.println(br.readLine());
    }
}
