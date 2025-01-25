package com.cooksystem1;

public class BeefHotPot extends AbstractDish{

    // 属性：汤底
    private String soupBase;

    // 构造方法
    public BeefHotPot() {
    }


    public BeefHotPot(String name, String ingredient, int cookTime, String soupBase) {
        super(name, ingredient, cookTime);
        this.soupBase = soupBase;
    }

    // get/set
    public String getSoupBase() {
        return soupBase;
    }

    public void setSoupBase(String soupBase) {
        this.soupBase = soupBase;
    }


    // 特有方法
    public void cookerPowerSetting(int power) {
        System.out.println("正在调节电磁炉火力调整到" + power + "瓦");
    }
}
