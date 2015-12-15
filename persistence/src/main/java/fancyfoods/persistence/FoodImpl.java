package fancyfoods.persistence;

import fancyfoods.food.Food;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "FOOD")
public class FoodImpl implements Food {
    @Id
    private String name;
    private double price;
    private int quantity;

    public FoodImpl() {
    }

    public FoodImpl(String name, double price, int quantity) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getQuantityInStock() {
        return this.quantity;
    }

    public void setQuantityInStock(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "There were " + getQuantityInStock() + " packs of " + getName() + " in stock.";
    }
}

