package com.achanzhang.free;

import java.math.BigDecimal;

public class StringIsNumberTest {
    public static void main(String[] args) {
        String a = "00";
        boolean numeric = isNumeric(a);
        System.out.println(numeric);
    }

    public static boolean isNumeric(String str) {
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
