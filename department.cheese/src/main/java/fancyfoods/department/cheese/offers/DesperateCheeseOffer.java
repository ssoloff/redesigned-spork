package fancyfoods.department.cheese.offers;

import fancyfoods.food.Food;
import fancyfoods.food.Inventory;
import fancyfoods.offers.SpecialOffer;
import java.util.List;

public class DesperateCheeseOffer implements SpecialOffer {
    private Inventory inventory;

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String getDescription() {
        return "A wonderful surprise for someone cheesy.";
    }

    @Override
    public Food getOfferFood() {
        List<Food> cheeses = inventory.getFoodsWhoseNameContains("cheese", 1);
        Food leastPopularCheese = cheeses.get(0);
        return leastPopularCheese;
    }
}
