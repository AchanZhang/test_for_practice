package com.achanzhang.free;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeFormatTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Calendar c = Calendar.getInstance();
//        c.add(Calendar.MONTH, 0);
//        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
//        c.set(Calendar.HOUR_OF_DAY,0);
//        c.set(Calendar.MINUTE,0);
//        c.set(Calendar.SECOND,0);
//        String first = format.format(c.getTime());
//        System.out.println("===============first:"+first);

//        Calendar ca = Calendar.getInstance();
//        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
//        ca.set(Calendar.HOUR_OF_DAY,23);
//        ca.set(Calendar.MINUTE,59);
//        ca.set(Calendar.SECOND,59);
//        String last = format.format(ca.getTime());
//        System.out.println("===============last:"+last);

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)-1);
//        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//        calendar.set(Calendar.HOUR_OF_DAY,23);
//        calendar.set(Calendar.MINUTE,59);
//        calendar.set(Calendar.SECOND,59);
//        String startMonthTime = String.format("%s-0%s-01 00:00:00",calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1);
//        String endMonthTime = sdf.format(calendar.getTime());
//        System.out.println(startMonthTime);
//        System.out.println(endMonthTime);
        String time = "2020-02-20 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateTime = sdf.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateTime);
        System.out.println(calendar.get(Calendar.YEAR) + calendar.get(Calendar.MONTH));
    }
}
