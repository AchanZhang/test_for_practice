package com.achanzhang.free;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @Author: zyc
 * @Date: 2020/5/29
 */
public class TimeDifferenceTest3 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse("2020-05-29 10:50:00");
        Date date = new Date();
        long between = date.getTime() - parse.getTime();
        long day = between / (24 * 60 * 60 * 1000);
        long hour = (between / (60 * 60 * 1000) - day * 24);
        long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        long ss = between / 1000;
        StringBuilder result = new StringBuilder();
        if (day != 0) {
            result.append(day).append("天");
        }
        if (hour != 0) {
            result.append(hour).append("小时");
        }
        if (min != 0) {
            result.append(min).append("分钟");
        }
        if (s != 0) {
            result.append(s).append("秒");
        }
        System.out.println(result.toString());
        System.out.println(ss);
    }
}
