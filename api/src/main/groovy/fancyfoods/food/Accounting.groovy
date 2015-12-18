package fancyfoods.food

interface Accounting {
    Customer getCustomer(String name)
    void chargeToAccount(String name, double purchaseAmount)
}
