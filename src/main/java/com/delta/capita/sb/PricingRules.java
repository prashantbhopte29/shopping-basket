package com.delta.capita.sb;

public class PricingRules {

    public static int computeCost(Item item, int count) {
        switch (item) {
            case APPLE:
                return count * 35;
            case BANANA:
                return count * 20;
            case MELON:
                return ((count / 2) + (count % 2)) * 50;
            case LIME:
                return ((count / 3) * 2 + (count % 3)) * 15;
            default:
                throw new IllegalArgumentException();
        }
    }

}
