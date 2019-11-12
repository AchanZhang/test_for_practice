package com.achanzhang.highConcurrency.immutableExample;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.NotThreadSafe;

import java.util.Map;

@Slf4j
@NotThreadSafe
public class ImmutableExample1 {

    private final static Integer a = 1;
    private final static String b = "2";
    private final static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
    }

    public static void main(String[] args) {
//        a = 2;
//        b = "3";
//        map = Maps.newHashMap();
        //仍然可以改变put里面的值
        map.put(1,3);
        log.info("{}",map.get(1));
    }

    private void test(final int a){
        //不允许修改的
//        a = 1;
    }
}
