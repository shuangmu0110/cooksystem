package com.cooksystem1;

public class CookSystemTest {
    public static void main(String[] args) {

        // 创建厨师
        Cook c = new Cook("张大厨", 40);
        // 创建菜品对象
        BeefGuoTiao bft = new BeefGuoTiao("牛肉粿条", "粿条", 10, "煮");
        BeefHotPot bhp = new BeefHotPot("牛肉火锅", "牛肉", 15, "清汤");
        // 调用做菜方法
        cook(bft, c);
        cook(bhp, c);
        // 调用上菜方法
        serve(bft, c);
        serve(bhp, c);
        // 调用特有方法
        bft.addSeasoning("沙茶酱");
        bhp.cookerPowerSetting(1500);
    }

    // 做菜方法
    public static void cook(AbstractDish dish, Cook c) {
        dish.cook(c);
    }

    // 上菜方法
    public static void serve(AbstractDish dish, Cook c) {
        dish.serve(c);
    }
}
