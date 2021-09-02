package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee machine has: ");
        int coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int cupsCount = 0;
        int waterRecipe = 200;
        int milkRecipe = 50;
        int coffeeRecipe = 15;

        while (water >= waterRecipe && milk >= milkRecipe && coffee >= coffeeRecipe) {
            cupsCount++;
            water -= waterRecipe;
            milk -= milkRecipe;
            coffee -= coffeeRecipe;
        }

        if (cupsCount < cups) {
            System.out.println("No, I can make only " + cupsCount + " cup(s) of coffee");
        } else if (cupsCount > cups) {
            int cupsDifference = cupsCount - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + cupsDifference + "more than that");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}
