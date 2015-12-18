package fancyfoods.persistence;

import fancyfoods.food.Customer;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerImpl implements Customer {
    @Id
    private String name;
    private double creditLimit;
    private double balance;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String toString() {
        return getName() + " had a balance of £" + getBalance() + " and a credit limit of £" + getCreditLimit();
    }
}
