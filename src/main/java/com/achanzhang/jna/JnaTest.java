package com.achanzhang.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @Author: zyc
 * @Date: 2020/4/21
 */
public class JnaTest {
    //继承libray，用于加载库文件
    public interface Clibrary extends Library {
        Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("JnaTest", Clibrary.class);

        //此方法为链接库中的方法
        int add(int a, int b);
    }

    public static void main(String[] args) {
        //调用
        System.out.println(Clibrary.INSTANTCE.add(1,2));
    }
}
