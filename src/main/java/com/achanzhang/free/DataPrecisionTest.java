package com.achanzhang.free;

import java.math.BigDecimal;

public class DataPrecisionTest {
    public static void main(String[] args) {
        String str = "1";
        BigDecimal bigDecimal = new BigDecimal("0.00");
        BigDecimal bigDecimal1 = new BigDecimal(str).setScale(0, BigDecimal.ROUND_HALF_UP);
        if (!bigDecimal1.equals(BigDecimal.ZERO)) {
            System.out.println(bigDecimal.divide(bigDecimal1));
        } else {
            System.out.println("???");
        }
//        BigDecimal bigDecimal = new BigDecimal("0.001");
//        System.out.println(bigDecimal.setScale(0, BigDecimal.ROUND_UP));

    }
}
