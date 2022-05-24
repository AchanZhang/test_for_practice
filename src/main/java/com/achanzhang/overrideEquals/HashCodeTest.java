package com.achanzhang.overrideEquals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zyc97
 */
public class HashCodeTest {
    public static void main(String[] args) {
        //不重新equals和hashcode
        Personsa person1 = new Personsa("zyc", 1);
        Personsa person2 = new Personsa("zyc", 1);
        System.out.println("stu:" + person1.equals(person2));
        Set<Personsa> set = new HashSet<>();
        set.add(person1);
        System.out.println("s1 hashCode:" + person1.hashCode());
        System.out.println("add s1 size:" + set.size());
        set.add(person2);
        System.out.println("s2 hashCode:" + person2.hashCode());
        System.out.println("add s2 size:" + set.size());

        System.out.println("-----------------------------------");
        //重写equals，指定对比name
        OverrideEquals person3 = new OverrideEquals("zyc", 1);
        OverrideEquals person4 = new OverrideEquals("zyc", 2);
        System.out.println("stu:" + person3.equals(person4));
        Set<OverrideEquals> eqSet = new HashSet<>();
        eqSet.add(person3);
        System.out.println("s3 hashCode:" + person3.hashCode());
        System.out.println("add s3 size:" + eqSet.size());
        eqSet.add(person4);
        System.out.println("s4 hashCode:" + person4.hashCode());
        System.out.println("add s4 size:" + eqSet.size());

        System.out.println("-----------------------------------");
        //重写hashcode，指定对比name的hashcode
        OverrideHashcode person5 = new OverrideHashcode("zyc", 1);
        OverrideHashcode person6 = new OverrideHashcode("zyc", 2);
        System.out.println("stu:" + person5.equals(person6));
        Set<OverrideHashcode> haSet = new HashSet<>();
        haSet.add(person5);
        System.out.println("s5 hashCode:" + person5.hashCode());
        System.out.println("add s5 size:" + haSet.size());
        haSet.add(person6);
        System.out.println("s6 hashCode:" + person6.hashCode());
        System.out.println("add s6 size:" + haSet.size());
    }
}
