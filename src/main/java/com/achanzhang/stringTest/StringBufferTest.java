package com.achanzhang.stringTest;


import org.apache.commons.lang3.StringUtils;

/**
 * @Author: zyc
 * @Date: 2020/4/24
 */
public class StringBufferTest {
    public static void main(String[] args) {
//        StringBuffer cmd = new StringBuffer();
//        cmd.append("0010250401020100011102000720130529161629A499EA2F255E00000000000000");
//        int length = cmd.length()/2;
//        System.out.println(Integer.toHexString(length));

//        int cmdLength = 10;
//        String a = StringUtils.leftPad(Integer.toHexString(cmdLength + 16), 4, "0");
//        System.out.println(a);

//        StringBuffer stringBuffer = new StringBuffer();
//        if (StringUtils.isEmpty(stringBuffer)) {
//            System.out.println("111");
//        } else {
//            System.out.println(stringBuffer.toString());
//        }

//        String statusHex = "fc";
//        int i = Integer.parseInt(statusHex, 16);
//        String valveStatusBin = Integer.toBinaryString(i);
//        System.out.println(valveStatusBin.substring(6));

//        String a = "132.20";
//        System.out.println(Float.parseFloat(a));

        String a = null;
        String b = "123";
        if (a.equals(b)) {
            System.out.println("111");
        } else {
            System.out.println("1");
        }
    }
}
