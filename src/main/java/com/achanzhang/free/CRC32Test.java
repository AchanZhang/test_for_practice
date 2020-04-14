package com.achanzhang.free;

import sun.security.krb5.internal.crypto.crc32;

import java.util.zip.CRC32;

public class CRC32Test {
    public static void main(String[] args) {
        String string = "001A0010250401020100011102000720130529161629";
//        String string = "90B01D003FCD00000D3030335F696E6465782E786D6C00000002FFFE";
        byte[] result = new byte[string.length() / 2];
        for(int i = 0; i < string.length(); i+=2) {
            result[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4)
                    + Character.digit(string.charAt(i + 1), 16));
        }
//        byte[] b = string.getBytes();
        CRC32 a = new CRC32();
        a.update(result, 0, result.length);
        System.out.println(Long.toHexString(a.getValue()));
    }
}
