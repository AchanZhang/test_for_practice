package com.achanzhang.free;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("collectTime", "2020");
        map.put("install", "199");
        if (map.size() <= 1) {
            System.out.println(false);
        }
    }
}
