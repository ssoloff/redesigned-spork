package fancyfoods.department.chocolate.food;

import fancyfoods.food.Food;

public class SquareChocolates implements Food {
    @Override
    public String getName() {
        return "square chocolates";
    }

    @Override
    public double getPrice() {
        return 2.25;
    }

    @Override
    public int getQuantityInStock() {
        return 2112;
    }
}

