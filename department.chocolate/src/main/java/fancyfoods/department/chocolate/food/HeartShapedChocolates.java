package fancyfoods.department.chocolate.food;

import fancyfoods.food.Food;

public class HeartShapedChocolates implements Food {
    @Override
    public String getName() {
        return "heart-shaped chocolates";
    }

    @Override
    public double getPrice() {
        return 6.5;
    }

    @Override
    public int getQuantityInStock() {
        return 42;
    }
}

