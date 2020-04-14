package com.achanzhang.free;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

public class TimeDifferenceTest2 {
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        LocalDateTime testTime = LocalDateTime.of(2019,3,13,13,13,13);
        System.out.println(testTime);

        LocalDateTime testTime1 = LocalDateTime.of(2019,3,13,13,13);
        System.out.println(testTime1);

        //计算相差天数
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusDays(7);

        System.out.println("开始时间：" + startTime.format(df) + "，结束时间：" + endTime.format(df));

        LocalDateTime dateTest = LocalDateTime.parse("2018-02-30 12:12:12", df);
        System.out.println("时间自动转化：" + dateTest.toString());

        int daysNum = Period.between(startTime.toLocalDate(), endTime.toLocalDate()).getDays();
        int monthNum = Period.between(startTime.toLocalDate(), endTime.toLocalDate()).getMonths();
        int days = Period.between(startTime.toLocalDate(), endTime.toLocalDate()).getDays();
        System.out.println("相差天数：" + daysNum);
        System.out.println("相差月数：" + monthNum);
        System.out.println("相差天数：" + days);

        System.out.println("当前时间向前推6天：" + LocalDateTime.now().minusDays(6));
        System.out.println("当前时间向前推6小时：" + LocalDateTime.now().minusHours(6));


    }
}
