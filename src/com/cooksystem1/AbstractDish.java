package com.cooksystem1;

public abstract class AbstractDish {

    // 属性
    private String name;
    private String ingredient;
    // 烹饪时间，按分钟计算
    private int cookTime;

    // 构造方法
    public AbstractDish() {
    }

    public AbstractDish(String name, String ingredient, int cookTime) {
        this.name = name;
        this.ingredient = ingredient;
        this.cookTime = cookTime;
    }

    // get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    // 行为
    public void cook(Cook c) {
        System.out.println("年龄为" + c.getAge() + "岁的" + c.getName() +
                "正在做" + getName() + ", 配料为" + getIngredient() +
                ", 需要" + getCookTime() + "分钟");
    }

    public void serve(Cook c) {
        System.out.println(c.getName() + "为顾客上菜，菜品为" + getName());
    }

}
