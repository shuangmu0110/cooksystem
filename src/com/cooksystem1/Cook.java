package com.cooksystem1;

public class Cook {

    // 属性
    private String name;
    private int age;

    // 构造方法
    public Cook() {
    }

    public Cook(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // get/set
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
}
