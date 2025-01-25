package com.cooksystem2;

import com.cooksystem1.Cook;

public class BeefGuoTiao implements Dish {

    // 属性：做法
    private String method;

    // 构造方法
    public BeefGuoTiao() {
    }

    public BeefGuoTiao(String method) {
        this.method = method;
    }

    // get/set方法
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public void cook(Cook c) {
        System.out.println("年龄为" + c.getAge() + "岁的" + c.getName() + "正在做牛肉粿条");
    }

    @Override
    public void serve(Cook c) {
        System.out.println(c.getName() + "为顾客上菜，菜品为牛肉粿条");
    }

    public void addSeasoning(String Seasoning) {
        System.out.println("为牛肉粿条添加" + Seasoning);
    }
}
