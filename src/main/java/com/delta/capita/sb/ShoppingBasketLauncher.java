package com.delta.capita.sb;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingBasketLauncher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter items in the basket separated by space (e.g., apple banana melon lime):");
        String input = scanner.nextLine();

        List<String> itemList = Arrays.stream(input.trim().split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        try {
            PricingCalculator calculator = new PricingCalculator();
            int totalPrice = calculator.calculateTotal(itemList);

            System.out.println("Total cost: " +  totalPrice + "p");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid item detected. Please enter valid items only: Apple, Banana, Melon, Lime.");
        }
    }

}
