package com.cooksystem2;

import com.cooksystem1.Cook;

import java.util.Scanner;

public class CookSystem2Test {
    public static void main(String[] args) {

        // 创建厨师
        Cook c = new Cook("张大厨", 40);
        // 创建菜品对象
        BeefGuoTiao bft = new BeefGuoTiao("煮");
        BeefHotPot bhp = new BeefHotPot("清汤");
        // 调用cook、serve方法
        bft.cook(c);
        bhp.cook(c);
        bft.serve(c);
        bhp.serve(c);
        // 调用特有方法并利用键盘输入参数
        // 创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的调料");
        String seasoning = sc.next();
        bft.addSeasoning(seasoning);
        System.out.println("请输入要调整到的电磁炉火力");
        int power = sc.nextInt();
        bhp.cookerPowerSetting(power);
    }
}
