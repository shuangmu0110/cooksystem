package com.cooksystem2;

import com.cooksystem1.Cook;

public class BeefHotPot implements Dish {

    // 属性：汤底
    private String soupBase;

    // 构造方法
    public BeefHotPot() {
    }

    public BeefHotPot(String soupBase) {
        this.soupBase = soupBase;
    }

    // get/set
    public String getSoupBase() {
        return soupBase;
    }

    public void setSoupBase(String soupBase) {
        this.soupBase = soupBase;
    }

    @Override
    public void cook(Cook c) {
        System.out.println("年龄为" + c.getAge() + "岁的" + c.getName() + "正在准备牛肉火锅");
    }

    @Override
    public void serve(Cook c) {
        System.out.println(c.getName() + "为顾客上菜，菜品为牛肉火锅");
    }

    // 特有方法
    public void cookerPowerSetting(int power) {
        System.out.println("正在调节电磁炉火力调整到" + power + "瓦");
    }
}
