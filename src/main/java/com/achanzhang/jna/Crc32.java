package com.achanzhang.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @Author: zyc
 * @Date: 2020/4/21
 */
public class Crc32 {
    //继承libray，用于加载库文件
    public interface Clibrary extends Library {
        Clibrary INSTANTCE = (Clibrary) Native.loadLibrary("crc32", Clibrary.class);

        //此方法为链接库中的方法
        Long calc_crc(byte[] a, int b);
    }

    public static void main(String[] args) {
        byte[] a = new byte[]{0x00, 0x16, 0x00, 0x10, 0x25, 0x04, 0x01, 0x01, 0x02, 0x00, 0x07, 0x20, 0x13, 0x05, 0x29, 0x16, 0x22, 0x09, 0x00, 0x00};
        byte[] b = new byte[]{0x00, 0x16, 0x75, 0x20, (byte) 0x99, 0x00, 0x01, 0x01, 0x02, 0x00, 0x07, 0x20, 0x20, 0x03, 0x31, 0x15, 0x50, 0x09};
        //调用
        System.out.println(Long.toHexString(Clibrary.INSTANTCE.calc_crc(b, 20)));
    }
}
