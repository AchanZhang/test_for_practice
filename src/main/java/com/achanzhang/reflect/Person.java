package com.achanzhang.reflect;

public class Person {
    String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }

    public void test(String name, Integer age) {
        System.out.println("调用成功");
    }

    private void methodTestTwo() {
        System.out.println("调用method2成功");
    }
}
