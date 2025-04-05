package com.delta.capita.sb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricingCalculator {

    public int calculateTotal(List<String> shoppingList) {
        Map<Item, Integer> itemCounter = new HashMap<>();

        for (String itemStr : shoppingList) {
            Item item = Item.valueOf(itemStr.trim().toUpperCase());
            itemCounter.put(item, itemCounter.getOrDefault(item, 0) + 1);
        }

        int total = 0;
        for (Map.Entry<Item, Integer> entry : itemCounter.entrySet()) {
            total += PricingRules.computeCost(entry.getKey(), entry.getValue());
        }

        return total;
    }

}
