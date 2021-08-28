import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;
        System.out.println(hundreds + tens + units);
    }
}