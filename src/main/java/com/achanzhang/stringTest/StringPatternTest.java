package com.achanzhang.stringTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zyc
 * @Date: 2020/5/22
 */
public class StringPatternTest {
    public static void main(String[] args) {
        String a = "DN15";
        String pattern ="[^0-9]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(a);
        System.out.println(m.replaceAll("").trim());
    }
}
