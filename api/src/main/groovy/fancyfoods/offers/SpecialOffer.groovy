package fancyfoods.offers

import fancyfoods.food.Food

interface SpecialOffer {
    Food getOfferFood()
    String getDescription()
}

