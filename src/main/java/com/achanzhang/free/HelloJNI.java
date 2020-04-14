package com.achanzhang.free;

public class HelloJNI {
    static {
        //hello.dll(Windows) or libhello.so(Unixes)
        System.loadLibrary("HelloJNI");
    }

    private native void sayHello();

    public static void main(String[] args) {
        new HelloJNI().sayHello();
    }
}
