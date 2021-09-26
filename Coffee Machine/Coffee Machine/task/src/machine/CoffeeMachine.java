package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void print(int waterIn, int milkIn, int coffeeIn, int cupsIn, int moneyIn) {
        System.out.println("The coffee machine has:\n" +
                waterIn + " ml of water\n" +
                milkIn + " ml of milk\n" +
                coffeeIn + " g of coffee beans\n" +
                cupsIn + " disposable cups\n" +
                "$" + moneyIn + " of money\n");
    }

    public static boolean isEnough(String type, int waterIn, int milkIn, int coffeeIn, int cupsIn) {
        boolean enough = false;

        int waterLimit;
        int milkLimit;
        int beansLimit;

        switch (type) {
            case "1": // espresso
                waterLimit = 250;
                milkLimit = 0;
                beansLimit = 16;
                break;
            case "2": // latte
                waterLimit = 350;
                milkLimit = 75;
                beansLimit = 20;
                break;
            case "3": // cappuccino
                waterLimit = 200;
                milkLimit = 100;
                beansLimit = 12;
                break;
            default:
                return false;
        }
        if (waterIn < waterLimit) {
            System.out.println("Sorry, not enough water!");
        } else if (milkIn < milkLimit) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeIn < beansLimit) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cupsIn < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            enough = true;
            System.out.println("I have enough resources, making you a coffee!");
        }

        return enough;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterIn = 400;
        int milkIn = 540;
        int coffeeIn = 120;
        int cupsIn = 9;
        int moneyIn = 550;

        while (true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            System.out.println();

            switch (action) {
                case "buy":
                    System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu: ");
                    String type = scanner.next();
                    boolean enough = isEnough(type, waterIn, milkIn, coffeeIn, cupsIn);

                    switch (type) {
                        case "1": // espresso
                            if (enough) {
                                waterIn -= 250;
                                coffeeIn -= 16;
                                cupsIn -= 1;
                                moneyIn += 4;
                            }
                            break;
                        case "2": // latte
                            if (enough) {
                                waterIn -= 350;
                                milkIn -= 75;
                                coffeeIn -= 20;
                                cupsIn -= 1;
                                moneyIn += 7;
                            }
                            break;
                        case "3": // cappuccino
                            if (enough) {
                                waterIn -= 200;
                                milkIn -= 100;
                                coffeeIn -= 12;
                                cupsIn -= 1;
                                moneyIn += 6;
                            }
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Unknown coffee type");
                            break;
                    }
                    break;
                case "fill":
                    System.out.print("Write how many ml of water do you want to add: ");
                    waterIn += scanner.nextInt();
                    System.out.print("Write how many ml of milk do you want to add: ");
                    milkIn += scanner.nextInt();
                    System.out.print("Write how many grams of coffee beans do you want to add: ");
                    coffeeIn += scanner.nextInt();
                    System.out.print("Write how many disposable cups of coffee do you want to add: ");
                    cupsIn += scanner.nextInt();
                    break;
                case "take":
                    System.out.printf("I gave you $%d\n", moneyIn);
                    moneyIn = 0;
                    break;
                case "remaining":
                    print(waterIn, milkIn, coffeeIn, cupsIn, moneyIn);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            System.out.println();
        }
    }
}
