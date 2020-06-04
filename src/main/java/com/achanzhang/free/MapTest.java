package com.achanzhang.free;

import java.util.*;

public class MapTest {
    //    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("collectTime", "2020");
//        map.put("install", "199");
//        if (map.size() <= 1) {
//            System.out.println(false);
//        }
//        List<String> list1 = new ArrayList<>();
//        Map<String, List<String>> map1 = new HashMap<>();
//        List<String> list2 = new ArrayList<>();
//        List<String> list3 = new ArrayList<>();
//
//        list1.add("1");
//        list1.add("11");
//        list1.add("111");
//        list2.add("2");
//        list2.add("3");
//        list2.add("4");
//        list3.add("3");
//        list3.add("33");
//        list3.add("333");
//        map1.put("1", list1);
//        map1.put("3", list3);
//
//        map.put("map1", map1);
//        map.put("list2", list2);
//
//        System.out.println(map.toString());
//        map.put("D0正数", "123");
//        System.out.println(map.get("D0正数"));
//    }
    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        Map<String, List<String>> d = new LinkedHashMap<>();
        a.add("a");
        b.add("b");
        c.add("c");
        d.put("1",a);
        d.put("2",b);
        d.put("3",c);
        a.add("1");
        d.put("1",a);
        d.forEach((k,v) -> {
            result.add(v);
        });
        System.out.println(d);
        System.out.println(result);

    }
}
