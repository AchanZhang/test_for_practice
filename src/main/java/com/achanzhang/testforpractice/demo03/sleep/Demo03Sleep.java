package com.achanzhang.testforpractice.demo03.sleep;

public class Demo03Sleep {
    public static void main(String[] args){
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
