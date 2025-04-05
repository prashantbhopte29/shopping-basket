package com.delta.capita.sb;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PricingCalculatorTest {

    @Test
    void testMixedItems() {
        PricingCalculator calculator = new PricingCalculator();
        int result = calculator.calculateTotal(Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime"));
        assertEquals(35*2 + 20 + 50 + 15*2, result); // 70 + 20 + 50 + 30 = 170
    }

    @Test
    void testMelonOffer() {
        PricingCalculator calculator = new PricingCalculator();
        assertEquals(100, calculator.calculateTotal(Arrays.asList("Melon", "Melon", "Melon", "Melon"))); // 2 * 50
    }

    @Test
    void testLimeOffer() {
        PricingCalculator calculator = new PricingCalculator();
        assertEquals(30, calculator.calculateTotal(Arrays.asList("Lime", "Lime", "Lime"))); // 2 * 15
    }

}