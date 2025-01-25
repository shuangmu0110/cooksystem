package com.cooksystem1;

public class BeefGuoTiao extends AbstractDish{

    // 属性：做法
    private String method;

    // 构造方法
    public BeefGuoTiao() {
    }


    public BeefGuoTiao(String name, String ingredient, int cookTime, String method) {
        super(name, ingredient, cookTime);
        this.method = method;
    }

    // get/set方法
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void addSeasoning(String seasoning) {
        System.out.println("为牛肉粿条添加" + seasoning);
    }
}
