package com.achanzhang.reflect;

public class TestReflectAndGenericity {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        Person entity = new Person();
        personDAO.save(entity);
        Person result = personDAO.get(1);
        System.out.println(result);
    }
}
