package com.derry.s7.KtBase130;

// 2.懒汉式的实现  Java版本
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {}

    public static SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        SingletonDemo2.getInstance().show();
    }
}


