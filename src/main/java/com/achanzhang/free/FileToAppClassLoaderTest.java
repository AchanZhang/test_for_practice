package com.achanzhang.free;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileToAppClassLoaderTest {
//    public static void main(String[] args) {
//        String a = "123456789";
//        System.out.println(a.substring(2,6));
//    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Class.forName("com.achanzhang.free.FileToAppClassLoaderTest").getClassLoader();
        System.out.println(classLoader);
        FileToAppClassLoaderTest fileToAppClassLoaderTest = new FileToAppClassLoaderTest();
        fileToAppClassLoaderTest.testClassLoader();
    }

//    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader classLoader = Class.forName("java.lang.Object").getClassLoader();
//        System.out.println(classLoader);
//    }

    public void testClassLoader() throws IOException {
        InputStream in1 = null;
        in1 = this.getClass().getClassLoader().getResourceAsStream("1.txt");
        InputStreamReader is = new InputStreamReader(in1);
        BufferedReader br = new BufferedReader(is);
        StringBuilder a = new StringBuilder();
        a.append(br.readLine());
        System.out.println(a);
    }
}
