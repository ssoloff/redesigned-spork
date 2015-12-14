package fancyfoods.department.chocolate.offers;

import java.util.Calendar;
import fancyfoods.department.chocolate.food.HeartShapedChocolates;
import fancyfoods.department.chocolate.food.SquareChocolates;
import fancyfoods.food.Food;
import fancyfoods.offers.SpecialOffer;

public class RomanticChocolateOffer implements SpecialOffer {
    @Override
    public String getDescription() {
        return "A wonderful surprise for someone you want to impress.";
    }

    @Override
    public Food getOfferFood() {
        if (isNearValentinesDay()) {
            return new HeartShapedChocolates();
        } else {
            return new SquareChocolates();
        }
    }

    private boolean isNearValentinesDay() {
        Calendar today = Calendar.getInstance();
        return today.get(Calendar.MONTH) == Calendar.FEBRUARY
            && today.get(Calendar.DAY_OF_MONTH) <= 14;
    }
}

