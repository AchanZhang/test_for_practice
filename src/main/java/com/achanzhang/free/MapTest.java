package com.achanzhang.free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
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
        map.put("D0正数", "123");
        System.out.println(map.get("D0正数"));
    }
}
