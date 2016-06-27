package com.company;

/**
 * Created by yby on 2016/6/27.
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void say(){
        System.out.println("animal");
    }
}
