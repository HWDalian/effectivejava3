package com.huiwenyuan.effectivejava.directories.lesson2.section2;

/**
 * 慧文院
 * Builder模式创建一个对象
 * 这种方案结合了可伸缩构造器模式的安全性和JavaBeans模式的可阅读性
 * 对于Builder模式我的理解是：
 * 避免使用JavaBeans的setter方法和多构造函数的方法创建对象。
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder {

        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;


        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;

            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    public static void main(String args[]) {
        /**
         * 使用Builder模式创建对象
         * Builder 是NutritionFacts类中的一个静态内部类
         * calories方法是给calories属性赋值
         * build方法是创建NutritionFacts对象
         * 在真实开发场景中，我们还可以在Builder内部类的属性赋值方法中进行有效性校验。
         */
        NutritionFacts pro = new NutritionFacts.Builder(10, 100).calories(200).build();
    }
}
