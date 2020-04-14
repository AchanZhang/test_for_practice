package com.achanzhang.free;

public class StringJNI {
    static {
        System.loadLibrary("StringJNI");
    }

    private native String sayHello(String name);

    public static void main(String[] args) {
        String rs = new StringJNI().sayHello("AchanZhang");
        System.out.println("Java类接收到来自JNI的返回:"+rs);
    }
}
