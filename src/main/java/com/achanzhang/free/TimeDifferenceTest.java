package com.achanzhang.free;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class TimeDifferenceTest {
    public static long fromDateStringToLong(String inVal) { // 此方法计算时间毫秒
        // 定义时间类型
        Date date = null;
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            date = inputFormat.parse(inVal); // 将字符型转换成日期型
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(date).getTime(); // 返回毫秒数
    }
    public static void main(String[] args) {
        long endT = fromDateStringToLong("2019-10-29 13:30:00"); // 定义测试时间1
        long startT = fromDateStringToLong("2019-10-29 13:39:01"); // 定义测试时间2
        long seconds = (startT - endT) / 1000; // 共计秒数
        int minutes = (int) seconds / 60; // 共计分钟数
        int hours = (int) seconds / 3600; // 共计小时数
        int days = (int) hours / 24; // 共计天数
        System.out.println("共" + days + "天,时间是：" + hours + " 小时 " + minutes + " 分钟"
                + seconds + " 秒 共计：" + seconds * 1000 + " 毫秒");
    }
}
